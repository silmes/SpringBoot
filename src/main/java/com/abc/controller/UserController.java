package com.abc.controller;

import com.abc.model.User;
import com.abc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(User user){
        userService.insert(user);
        return "SUCCESS";
    }
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String sayHello()
    {
        return "Hello Spring Boot!";
    }

    @RequestMapping(value = "/getOne",method = RequestMethod.GET)
    public User sayHello(@RequestParam(name = "id")Integer id)
    {
        return userService.findOne(id);
    }
}
