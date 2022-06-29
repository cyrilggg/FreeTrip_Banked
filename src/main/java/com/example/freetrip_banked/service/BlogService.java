package com.example.freetrip_banked.service;


import com.example.freetrip_banked.bean.BlogBean;
import java.util.List;

public interface BlogService {

    //根据Blog标题查询图书
    List<BlogBean> queryBlogById(String id);

    //根据id删除Blog
    int deleteBlog(String id);

    //查询所有的Blog
    List<BlogBean>queryAllBlog();

}
