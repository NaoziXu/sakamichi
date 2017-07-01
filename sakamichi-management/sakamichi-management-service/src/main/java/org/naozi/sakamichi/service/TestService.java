package org.naozi.sakamichi.service;

import org.naozi.sakamichi.dao.mapper.TestMapper;
import org.naozi.sakamichi.dao.model.Test;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Naozi on 2017/7/2.
 */
@Service
public class TestService {
    @Resource
    private TestMapper testMapper;

    public void testInsert(Test test){
        testMapper.insert(test);
    }
}
