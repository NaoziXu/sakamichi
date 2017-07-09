package org.naozi.sakamichi.web;

import org.naozi.sakamichi.domain.request.TestRequestDto;
import org.naozi.sakamichi.domain.response.TestResponseDto;
import org.naozi.sakamichi.intf.ITestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by Naozi on 2017/6/29.
 */
@Controller
public class IndexController {

    @Resource(name = "iTestService")
    private ITestService iTestService;

    @RequestMapping("/")
    public String toIndex(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("/testConsumer")
    public TestResponseDto testCounsumer(){
        TestRequestDto testRequestDto = new TestRequestDto();
        testRequestDto.setTestParam("Naozi");
        TestResponseDto result = iTestService.test(testRequestDto);
        return result;
    }
}
