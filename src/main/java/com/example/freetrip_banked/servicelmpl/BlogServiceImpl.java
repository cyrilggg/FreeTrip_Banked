package com.example.freetrip_banked.servicelmpl;

import com.example.freetrip_banked.bean.BlogBean;
import com.example.freetrip_banked.mapper.BlogMapper;
import com.example.freetrip_banked.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    BlogMapper blogMapper;

    @Override
    public List<BlogBean> queryBlogById(String id){
        return blogMapper.selectBlogById(id);
    }

    @Override
    public int deleteBlog(String id) {
        return blogMapper.deleteBlog(id);
    }

    @Override
    public List<BlogBean>queryAllBlog(){
        return blogMapper.getAllBlog();
    }

    }

