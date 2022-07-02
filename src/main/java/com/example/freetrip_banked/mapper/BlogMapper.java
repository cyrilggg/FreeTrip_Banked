package com.example.freetrip_banked.mapper;

import com.example.freetrip_banked.bean.BlogBean;

import java.util.List;

/**
 *
 * Title: BlogMapper
 * Description:
 * 博客数据接口
 * Version:1.0.0

 */
public interface BlogMapper {

    int deleteByUserKey(String id);

    List<BlogBean> findByUserId(String id);

    //根据id删除Blog
    int deleteBlog(String id);
}
