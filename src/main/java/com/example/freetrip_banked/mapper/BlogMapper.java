package com.example.freetrip_banked.mapper;

import com.example.freetrip_banked.bean.BlogBean;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 *
 * Title: BlogMapper
 * Description:
 * 博客数据接口
 * Version:1.0.0

 */
@Mapper
public interface BlogMapper {

    boolean deleteByUserKey(Integer id) throws Exception;

    List<BlogBean> findByUserId(Integer id);

    //根据id删除Blog
    int deleteBlog(String id);
    //根据name查询Blog
    List<BlogBean> selectBlogById(String id);
    //查看所有Blog
    List<BlogBean>getAllBlog();
}
