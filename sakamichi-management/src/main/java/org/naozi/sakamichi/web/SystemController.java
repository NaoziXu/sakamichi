package org.naozi.sakamichi.web;

import org.naozi.sakamichi.dao.domain.ResultBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


/**
 * system
 * @author Naozi
 * @date 2017/6/29
 */
@Controller
public class SystemController {

    /**
     * 用户会话合法性依据
     */
    @Value("${sakamichi.session.key}")
    private String sessionKey;

    /**
     * 跳转默认页面
     * @return
     */
    @RequestMapping("/")
    public ModelAndView toDefault(){
        ModelAndView view = new ModelAndView("login");
        return view;
    }

    /**
     * 跳转登陆页面
     * @return
     */
    @RequestMapping("/login")
    public ModelAndView toLogin(){
        ModelAndView view = new ModelAndView("login");
        return view;
    }

    /**
     * 登出并跳转登出页面
     * @return
     */
    @RequestMapping("/logout")
    public ModelAndView logout(HttpServletRequest request){
        request.getSession().setAttribute(sessionKey, null);
        return new ModelAndView("login");
    }

    @RequestMapping("/index")
    public ModelAndView toIndex(){
        ModelAndView view = new ModelAndView("index");
        return view;
    }

    /**
     * 跳转主页面
     * @return
     */
    @RequestMapping("/userLogin")
    @ResponseBody
    public ResultBean userLogin(String username, String password, HttpServletRequest request){
        request.getSession().setAttribute(sessionKey, username);
        request.getSession().setAttribute("username", username);
        return ResultBean.success("登录验证通过");
    }

    /**
     * 返回页面
     * @param viewName
     * @return
     */
    @RequestMapping("/getContent/{viewName}")
    public ModelAndView getContent(@PathVariable String viewName) {
        return new ModelAndView(viewName);
    }

}
