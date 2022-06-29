package com.example.freetrip_banked.servicelmpl;

import com.example.freetrip_banked.bean.BlogBean;
import com.example.freetrip_banked.mapper.TourMapper;
import com.example.freetrip_banked.service.TourService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TourServiceImpl implements TourService {
    @Autowired
    TourMapper tourMapper;

    @Override
    public BlogBean selectBlogByName(String name) {
        return tourMapper.selectBlogByName(name);
    }

    @Override
    public int addBlog(BlogBean blogBean ) {
        return tourMapper.insertBlog(blogBean);
    }

    @Override
    public int add_praise(String id){
        return tourMapper.updatePraise(id);
    }

    @Override
    public List<BlogBean> queryAllBlog() {
        return tourMapper.getAllBlog();
    }
}
