package org.naozi.sakamichi.dubbo;

import org.naozi.sakamichi.domain.request.TestRequestDto;
import org.naozi.sakamichi.domain.response.TestResponseDto;
import org.naozi.sakamichi.intf.ITestService;

/**
 * Created by Naozi on 2017/7/2.
 */
public class TestServiceImpl implements ITestService {

    @Override
    public TestResponseDto test(TestRequestDto testRequestDto) {
        String param = testRequestDto.getTestParam();
        TestResponseDto responseDto = new TestResponseDto();
        responseDto.setResult("Hello " + param);
        return responseDto;
    }
}
