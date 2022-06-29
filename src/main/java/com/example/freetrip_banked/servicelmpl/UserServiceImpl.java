package com.example.freetrip_banked.servicelmpl;

import com.example.freetrip_banked.mapper.BlogMapper;
import com.example.freetrip_banked.bean.BlogBean;
import com.example.freetrip_banked.mapper.UserMapper;
import com.example.freetrip_banked.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.lang.*;

/**
 *
 * Title: UserServiceImpl
 * Description:
 * 用户操作实现类
 * Version:1.0.0

 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper ;

    @Autowired
    private BlogMapper blogMapper ;

    @Override
    public boolean deleteUser(String id) {
        Integer u=0;
        boolean flag=false;
        try{
            u=Integer.parseInt(id);
        }catch(NumberFormatException e){
            e.printStackTrace();
        }
        try{
            blogMapper.deleteByUserKey(u);
            userMapper.deleteByPrimaryKey(u);
            flag=true;
        }catch(Exception e){
            System.out.println("删除失败!");
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public int findPraiseById(String id) {
        Integer u=0;
        try{
            u=Integer.parseInt(id);
        }catch(NumberFormatException e){
            e.printStackTrace();
        }
        int sum=0;
        List<BlogBean> L=blogMapper.findByUserId(u);
        for(BlogBean b: L){
            sum=sum+b.getPraise();
        }
        return sum;
    }
}
