package com.sunny.controller;

import com.sunny.model.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sunlei on 2019/8/28.
 */
@Controller
@RequestMapping("ftl")
public class FreemarkerController {

    @Autowired
    private Resource resource;

    @RequestMapping("/index")
    public String index(ModelMap map)
    {
        map.addAttribute("resource",resource);
        return "freemarker/index";
    }

    @RequestMapping("center")
    public String center()
    {
        return "freemarker/center/center";
    }
}
