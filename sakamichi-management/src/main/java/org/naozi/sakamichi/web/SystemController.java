package org.naozi.sakamichi.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by Naozi on 2017/6/29.
 */
@Controller
public class SystemController {

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
    public ModelAndView logout(){
        ModelAndView view = new ModelAndView("login");
        return view;
    }

    /**
     * 跳转主页面
     * @return
     */
    @RequestMapping("/index")
    public ModelAndView toIndex(){
        ModelAndView view = new ModelAndView("index");
        return view;
    }

    /**
     * 返回页面
     * @param viewName
     * @return
     */
    @RequestMapping("/getContent/{viewName}")
    public ModelAndView getContent(@PathVariable String viewName) {
        ModelAndView view = new ModelAndView(viewName);
        return view;
    }

}
