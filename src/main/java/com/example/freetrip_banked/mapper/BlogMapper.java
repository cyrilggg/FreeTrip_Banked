package com.example.freetrip_banked.mapper;

import com.example.freetrip_banked.bean.BlogBean;

import java.util.List;

public interface BlogMapper {
    //根据id删除Blog
    int deleteBlog(String id);
    //根据name查询Blog
    List<BlogBean> selectBlogById(String id);
    //查看所有Blog
    List<BlogBean>getAllBlog();
}
