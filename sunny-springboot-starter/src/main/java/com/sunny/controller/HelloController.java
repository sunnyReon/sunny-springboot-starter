package com.sunny.controller;

import com.sunny.model.JSONResult;
import com.sunny.model.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sunlei on 2019/8/4.
 */
@RestController
public class HelloController {

    @Autowired
    private Resource resource;

    @RequestMapping("/hello")
    public Object hello()
    {
        return "Hello springboot~~";
    }


    @RequestMapping("/getResource")
    public JSONResult getResource()
    {
        Resource bean = new Resource();
        BeanUtils.copyProperties(resource,bean);

        return JSONResult.ok(bean);
    }
}
