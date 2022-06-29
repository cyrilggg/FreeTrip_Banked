package com.example.freetrip_banked.service;
import com.example.freetrip_banked.bean.BlogBean;
import java.util.List;

/**
 *
 * Title: BlogService
 * Description:
 * 博客接口
 * Version:1.0.0

 */
public interface BlogService {

    //根据Blog标题查询图书
    List<BlogBean> queryBlogById(String id);

    //根据id删除Blog
    int deleteBlog(String id);

}
