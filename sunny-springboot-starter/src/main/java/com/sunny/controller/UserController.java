package com.sunny.controller;

import com.sunny.model.JSONResult;
import com.sunny.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 返回前端json对象
 * Created by sunlei on 2019/8/11.
 */
//@Controller
@RestController   //@RestController = @Controller + @ResponseBody
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/getUser")
    //@ResponseBody
    public User getUser()
    {
        User u=new User();
        u.setName("sunny2");
        u.setAge(18);
        u.setBirthday(new Date());
        u.setPassword("111111");

        return u;
    }

    @RequestMapping("/getUserJson")
    //@ResponseBody
    public JSONResult getUserJson()
    {
        User u=new User();
        u.setName("sunny2");
        u.setAge(19);
        u.setBirthday(new Date());
        u.setPassword("111111");

        return JSONResult.ok(u);
    }

}
