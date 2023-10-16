package com.zjf.controller;

import com.zjf.common.R;
import com.zjf.pojo.User;
import com.zjf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public R<User> login(@RequestBody User user,HttpServletRequest request){
        request.getSession().setAttribute("user",user);
        return userService.login(user);
    }

    @PostMapping("/register")
    public R<String> register(@RequestBody User user){


        return userService.register(user);
    }

    @PostMapping("/logout")
    public R<String> register(HttpServletRequest request){
        request.getSession().removeAttribute("user");

        return R.success(null,"退出成功");
    }


}
