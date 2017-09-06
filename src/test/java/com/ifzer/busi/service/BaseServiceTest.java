package com.ifzer.busi.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by nelson on 2017-09-06.
 */
@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath*:applicationContext.xml"})
public class BaseServiceTest {

    @Autowired
    private BaseService baseService;

    @Test
    public void testService(){
        baseService.service("lisi");
    }
}