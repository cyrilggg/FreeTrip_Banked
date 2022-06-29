package com.example.freetrip_banked.mapper;

import com.example.freetrip_banked.bean.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper {


    int insertUser(User user);

    User loginUser(User user);
}
