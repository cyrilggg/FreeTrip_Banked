package com.example.freetrip_banked.mapper;

import com.example.freetrip_banked.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;

/**
 *
 * Title: UserMapper
 * Description:
 * 用户数据接口
 * Version:1.0.0

 */
public interface UserMapper {

    int insertUser(UserBean user);

    UserBean loginUser(UserBean user);

    int deleteByPrimaryKey(String id);

    UserBean updateUser(UserBean user);
}
