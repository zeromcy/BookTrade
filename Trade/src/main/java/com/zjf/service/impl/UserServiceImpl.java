package com.zjf.service.impl;

import com.zjf.mapper.UserMapper;
import com.zjf.pojo.User;
import com.zjf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User login() {
        return userMapper.getUserByUsername();
    }

    @Override
    public String register(User user) {
        userMapper.insert(user);
        return null;
    }
}
