package com.ifzer.busi.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by nelson on 2017-09-06.
 */
@Service
public class BaseService {

    protected Logger log = LoggerFactory.getLogger(BaseService.class);

    public void service(String name){
        log.info("service {}", name);
    }

}
