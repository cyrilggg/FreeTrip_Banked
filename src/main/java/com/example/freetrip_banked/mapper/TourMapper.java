package com.example.freetrip_banked.mapper;

import com.example.freetrip_banked.bean.TourBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TourMapper {

    //查询博客
    TourBean selectBlogByName(String title);

    //插入新的图书
    int insertBlog(TourBean tourbean);

    int add_praise(TourBean tourBean);

    //查询所有博客
    List<TourBean> getAllBlog();

}
