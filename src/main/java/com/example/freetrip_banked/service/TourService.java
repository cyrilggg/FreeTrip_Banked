package com.example.freetrip_banked.service;

import com.example.freetrip_banked.bean.TourBean;

import java.util.List;

public interface TourService {
     //查询博客
    TourBean selectBlogByName(String title);

    //插入新的图书
    int addBlog(TourBean tourbean);

    int add_praise(TourBean tourBean);
    //查询所有博客
    List<TourBean> queryAllBlog();
}