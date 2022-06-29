package com.example.freetrip_banked.servicelmpl;

import com.example.freetrip_banked.bean.User;
import com.example.freetrip_banked.mapper.UserMapper;
import com.example.freetrip_banked.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(User user){
        int flag=userMapper.insertUser(user);
        return flag;
    }

    /**用户登录
     * @return*/
    public User LoginUser(User user){

        return userMapper.loginUser(user);
    }
}