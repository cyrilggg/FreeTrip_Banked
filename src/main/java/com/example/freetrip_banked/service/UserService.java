package com.example.freetrip_banked.service;

import com.example.freetrip_banked.bean.User;


public interface UserService {
    int  addUser(User user);             /**新增用户*/

    User LoginUser(User user);    /**用户登录核对*/
}
