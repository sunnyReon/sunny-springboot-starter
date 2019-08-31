package com.sunny.controller;

import com.sunny.model.JSONResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sunlei on 2019/8/31.
 */
@Controller
@RequestMapping("err")
public class ErrorController {

    @RequestMapping("/error")
    public  String error()
    {
        int a = 1/0;

        return "thymeleaf/error";
    }

    @RequestMapping("/ajaxerror")
    public String ajaxerror()
    {
        return "thymeleaf/ajaxerror";
    }

    @RequestMapping("/getAjaxerror")
    @ResponseBody
    public JSONResult getAjaxerror()
    {
        int a = 1/0;

        return JSONResult.ok();
    }
}
