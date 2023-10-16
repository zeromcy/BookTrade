package com.zjf.service.impl;

import com.zjf.common.R;
import com.zjf.mapper.UserMapper;
import com.zjf.pojo.User;
import com.zjf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public R<User> login(User user) {
        Map map = new HashMap();
        map.put("username",user.getUsername());
        map.put("status",user.getStatus());
        User query = userMapper.getUserByUsername(map);

        if(query == null){
            return R.error("用户名或密码错误");
        }
        return R.success(query,"登录成功");
    }

    @Override
    public R<String> register(User user) {
//        todo:查重
        Map map = new HashMap();
        map.put("username",user.getUsername());
        User queryUser = userMapper.queryUserByName(map);
        if(queryUser != null){
            return R.error("用户名重复");
        }
        int n = userMapper.insert(user);
        if(n<=0){
            return R.error("注册失败");
        }


        return R.success(null,"注册成功") ;
    }
}
