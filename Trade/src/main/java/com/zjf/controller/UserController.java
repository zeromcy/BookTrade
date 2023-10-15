package com.zjf.controller;

import com.zjf.pojo.User;
import com.zjf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public User login(){


        return userService.login();
    }

    @PostMapping("/register")
    public String register(@RequestBody User user){
        userService.register(user);
        return null;
    }
}
