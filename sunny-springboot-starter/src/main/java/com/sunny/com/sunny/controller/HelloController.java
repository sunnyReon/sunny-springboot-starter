package com.sunny.com.sunny.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sunlei on 2019/8/4.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Object hello()
    {
        return "Hello springboot~~";
    }
}
