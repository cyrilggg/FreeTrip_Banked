package com.example.freetrip_banked.servicelmpl;

import com.example.freetrip_banked.bean.BlogBean;
import com.example.freetrip_banked.mapper.BlogMapper;
import com.example.freetrip_banked.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.*;
import java.util.List;

/**
 *
 * Title: BlogServiceImpl
 * Description:
 * 博客操作实现类
 * Version:1.0.0

 */
@Service
public class BlogServiceImpl implements BlogService {
    @Autowired
    private BlogMapper blogMapper ;

    @Override
    public List<BlogBean> queryBlogById(String id){
        return blogMapper.findByUserId(id);
    }

    @Override
    public int deleteBlog(String id) {
        return blogMapper.deleteBlog(id);
    }

}

