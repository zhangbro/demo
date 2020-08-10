package com.zhang.demo.service;

import org.apache.dubbo.config.annotation.Service;

@Service
public class DemoServiceImpl implements DemoService {
    /**
     * @return
     */
    public String hello() {
        return "hello Dubbo";
    }
}
