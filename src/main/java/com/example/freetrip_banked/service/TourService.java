package com.example.freetrip_banked.service;

import com.example.freetrip_banked.bean.BlogBean;

import java.util.List;

public interface TourService {
     //查询博客
     BlogBean selectBlogByName(String title);

    //插入新的图书
    int addBlog(BlogBean tourbean);

    int add_praise(String id);
    //查询所有博客
    List<BlogBean> queryAllBlog();
}