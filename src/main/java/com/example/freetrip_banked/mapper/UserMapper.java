package com.example.freetrip_banked.mapper;

import org.apache.ibatis.annotations.Mapper;

/**
 *
 * Title: UserMapper
 * Description:
 * 用户数据接口
 * Version:1.0.0

 */
@Mapper
public interface UserMapper {

    boolean deleteByPrimaryKey(Integer id) throws Exception;
}
