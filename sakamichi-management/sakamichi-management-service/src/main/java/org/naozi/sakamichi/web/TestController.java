package org.naozi.sakamichi.web;

import org.naozi.sakamichi.dao.model.Test;
import org.naozi.sakamichi.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by Naozi on 2017/7/2.
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @Resource
    private TestService testService;

    @RequestMapping("/testInsert")
    public void testInsert(){
        Test test = new Test();
        testService.testInsert(test);
    }
}
