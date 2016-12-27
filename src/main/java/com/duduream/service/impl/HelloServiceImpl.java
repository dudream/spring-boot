package com.duduream.service.impl;

import com.duduream.bean.config.Config;
import com.duduream.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by dudream on 2016/12/27.
 */
@Service
@Slf4j
public class HelloServiceImpl implements HelloService {

    @Autowired
    private Config config;

    @Override
    public void sayHello() {
        log.info("Hello Spring Boot. {}", config.getEnv());
    }

}
