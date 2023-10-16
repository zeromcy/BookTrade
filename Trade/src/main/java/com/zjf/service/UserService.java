package com.zjf.service;

import com.zjf.common.R;
import com.zjf.pojo.User;
import org.springframework.stereotype.Service;


public interface UserService {
    R<User> login(User user);

    R<String> register(User user);
}
