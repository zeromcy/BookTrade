package com.zjf.mapper;

import com.zjf.common.R;
import com.zjf.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface UserMapper {
    User getUserByUsername(Map map);

    int insert(User user);

    User queryUserByName(Map map);
}
