package com.zhang.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ZhangBro
 */
@Controller
@RequestMapping("/")
public class IndexController {
    Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("/index")
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "this is msggggggg");
        mv.addObject("url", "sys/index");
        mv.setViewName("sys/index");
        return mv;
    }

    @RequestMapping(value = "to404")
    public ModelAndView getFtlByModelAndView() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "this is msg");
        mv.addObject("url", "sys/404");
        mv.setViewName("sys/404");
        return mv;
    }

}