package com.fttec.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Random;

/**
 * @author zhangbro
 */
@Controller("/")
@Slf4j
public class DemoController {

    @RequestMapping("index")
    public ModelAndView test() {
        Random random = new Random();
        int len = random.nextInt(4) + 4;
        StringBuffer sb = new StringBuffer();
        while (sb.length() < len) {
            char c = (char) (65 + random.nextInt(26));
            sb.append(c);
        }
        ModelAndView mv = new ModelAndView();
        log.info("{}", sb.toString());
        mv.addObject("name", sb.toString());
        mv.setViewName("sys/index");
        return mv;
    }
}
