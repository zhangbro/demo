package com.magiccube;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zhangbro
 */
@SpringBootApplication
@EnableSwagger2
public class QrCodeApplication {
    public static void main(String[] args) {
        SpringApplication.run(QrCodeApplication.class, args);
    }
}
