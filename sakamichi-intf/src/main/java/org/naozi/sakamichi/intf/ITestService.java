package org.naozi.sakamichi.intf;

import org.naozi.sakamichi.domain.request.TestRequestDto;
import org.naozi.sakamichi.domain.response.TestResponseDto;

/**
 * Created by Naozi on 2017/7/2.
 */
public interface ITestService {
    TestResponseDto test(TestRequestDto testRequestDto);
}