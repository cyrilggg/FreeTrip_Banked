package com.example.freetrip_banked.service;

/**
 *
 * Title: UserService
 * Description:
 * 用户接口
 * Version:1.0.0

 */
public interface UserService {

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
}
