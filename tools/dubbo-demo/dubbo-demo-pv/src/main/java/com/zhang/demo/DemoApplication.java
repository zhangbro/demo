package com.zhang.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangbro
 */
@SpringBootApplication
//@EnableDubboConfig
//@DubboComponentScan("com.zhang.demo.service")
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
