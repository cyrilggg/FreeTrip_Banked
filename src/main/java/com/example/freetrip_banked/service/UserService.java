package com.example.freetrip_banked.service;


import com.example.freetrip_banked.bean.UserBean;


public interface UserService {
    int  addUser(UserBean user);             /**新增用户*/

    UserBean LoginUser(UserBean user);    /**用户登录核对*/

    /**
     * 删除用户
     * @param id
     * @Service
     */
    boolean deleteUser(String id);

    /**
     * 根据用户id查询博客获赞数
     * @param id
     * @return
     * @Service
     */
    int findPraiseById(String id);

    UserBean updateUser(UserBean user);
}
