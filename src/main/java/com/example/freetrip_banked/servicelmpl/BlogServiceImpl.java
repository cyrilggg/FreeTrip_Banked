package com.example.freetrip_banked.servicelmpl;

import com.example.freetrip_banked.mapper.BlogMapper;
import com.example.freetrip_banked.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.*;

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

    /**
     * 删除博客
     * @param id
     * @Service
     */
    public boolean deleteBlog(String id){
        Integer u=0;
        boolean flag=false;
        try{
            u=Integer.parseInt(id);
        }catch(NumberFormatException e){
            e.printStackTrace();
        }
        try{
            blogMapper.deleteByUserKey(u);
            flag=true;
        }catch(Exception e){
            System.out.println("删除失败!");
            e.printStackTrace();
        }
        return flag;
    }
}