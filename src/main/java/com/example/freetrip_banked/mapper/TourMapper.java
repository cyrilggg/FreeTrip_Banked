package com.example.freetrip_banked.mapper;

import com.example.freetrip_banked.bean.BlogBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TourMapper {

    //查询博客
    BlogBean selectBlogByName(String title);

    //插入新的图书
    int insertBlog(BlogBean blogBean);

    int updatePraise(String id);

    //查询所有博客
    List<BlogBean> getAllBlog();

}
