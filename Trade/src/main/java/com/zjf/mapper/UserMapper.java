package com.zjf.mapper;

import com.zjf.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User getUserByUsername();

    String insert(User user);
}
