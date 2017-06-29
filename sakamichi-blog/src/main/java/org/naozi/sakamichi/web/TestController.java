package org.naozi.sakamichi.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by Naozi on 2017/6/29.
 */
@Controller
public class TestController {
    @ResponseBody
    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    @RequestMapping("/testView")
    public String hello(Map<String,Object> map){
        map.put("name", "Naozi");
        return "test";
    }
}
