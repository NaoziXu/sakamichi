package org.naozi.sakamichi.system.interceptor;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class CommonRenderVariableInterceptor extends HandlerInterceptorAdapter implements InitializingBean {

	/**
	 * 用户会话合法性依据
	 */
	@Value("${sakamichi.session.key}")
	private String sessionKey;

	/**
	 * 应用名
	 */
	@Value("${server.contextPath}")
	private String appName;

	// 系统启动并初始化一次的变量
	private Map<String, Object> globalRenderVariables = new HashMap<>();

	// 在系统启动时会执行
	@Override
	public void afterPropertiesSet() throws Exception {
		initSharedRenderVariables();
	}

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		super.afterCompletion(request, response, handler, ex);
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

		// 给视图请求添加基础参数
		if (modelAndView != null) {
			String viewName = modelAndView.getViewName();
			if (viewName != null) {
				modelAndView.addAllObjects(globalRenderVariables);
				modelAndView.addAllObjects(getBasicParam(request, response));
			}
			// 验证会话合法性
			HttpSession session = request.getSession();
			Object userObj = session.getAttribute(sessionKey);
			if(userObj == null && !"login".equals(viewName) && !"error".equals(viewName)){
				modelAndView.setViewName("redirect:/login");
			}
		}
		else {
			return;
		}
	}

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		return super.preHandle(request, response, handler);
	}

	/**
	 * 将基础参数加入model渲染
	 * @param request
	 * @param response
	 * @return
	 */
	private Map<String, Object> getBasicParam(HttpServletRequest request, HttpServletResponse response) {
		String basePath = request.getScheme() +"://" + request.getServerName()
				+ ":" +request.getServerPort() + appName;
		HashMap<String, Object> paramMap = new HashMap<>();
		paramMap.put("baseTime", new Date());
		paramMap.put("basePath", basePath);
		return paramMap;
	}

	private void initSharedRenderVariables() {
		// 存放一些共享的工具类,以便视图使用,如StringUtils
	}
}
