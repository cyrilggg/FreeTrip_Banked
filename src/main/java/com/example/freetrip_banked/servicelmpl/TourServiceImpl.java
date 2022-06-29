package com.example.freetrip_banked.servicelmpl;

import com.example.freetrip_banked.bean.TourBean;
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
    public TourBean selectBlogByName(String name) {
        return tourMapper.selectBlogByName(name);
    }

    @Override
    public int addBlog(TourBean tourBean ) {
        return tourMapper.insertBlog(tourBean);
    }

    @Override
    public int add_praise(TourBean tourBean){
        return tourMapper.add_praise(tourBean);
    }

    @Override
    public List<TourBean> queryAllBlog() {
        return tourMapper.getAllBlog();
    }
}
