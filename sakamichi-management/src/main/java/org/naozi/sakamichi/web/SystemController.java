package org.naozi.sakamichi.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by Naozi on 2017/6/29.
 */
@Controller
public class SystemController {

    @Value("${server.contextPath}")
    private String appName;

    /**
     * 跳转主页面
     * @return
     */
    @RequestMapping("/")
    public ModelAndView toIndex(HttpServletRequest request){
        String bathPath = request.getScheme() +"://" + request.getServerName()
                + ":" +request.getServerPort() + appName;
        ModelAndView view = new ModelAndView("index");
        view.addObject("bathPath", bathPath);
        return view;
    }

    /**
     * 返回页面
     * @param viewName
     * @return
     */
    @RequestMapping("/getContent/{viewName}")
    public ModelAndView getContent(HttpServletRequest request,@PathVariable String viewName) {
        String bathPath = request.getScheme() +"://" + request.getServerName()
                + ":" +request.getServerPort() + appName;
        ModelAndView view = new ModelAndView(viewName);
        view.addObject("bathPath", bathPath);
        return view;
    }

    /**
     * 登出
     * @param request
     * @return
     */
    @RequestMapping("/logout")
    public ModelAndView logout(HttpServletRequest request){
        String bathPath = request.getScheme() +"://" + request.getServerName()
                + ":" +request.getServerPort() + appName;
        ModelAndView view = new ModelAndView("login");
        view.addObject("bathPath", bathPath);
        return view;
    }

}
