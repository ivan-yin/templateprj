package com.ifzer.busi.controller;

import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by nelson on 2017-09-06.
 */
@Controller
@RequestMapping("hello/")
public class HelloController {

    private Logger log = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("welcome")
    @ResponseBody
    public String welcome(String name){
        log.info("welcome {}",name);
        return JSON.toJSONString("welcome " + name);
    }
}
