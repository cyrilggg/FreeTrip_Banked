package com.example.freetrip_banked.servicelmpl;

import com.example.freetrip_banked.bean.UserBean;
import com.example.freetrip_banked.mapper.BlogMapper;
import com.example.freetrip_banked.bean.BlogBean;
import com.example.freetrip_banked.mapper.UserMapper;
import com.example.freetrip_banked.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.lang.*;

/**
 * Title: UserServiceImpl
 * Description:
 * 用户操作实现类
 * Version:1.0.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private BlogMapper blogMapper;

    @Override
    public int addUser(UserBean user) {
        int flag = userMapper.insertUser(user);
        return flag;
    }

    /**
     * 用户登录
     *
     * @return
     */
    public UserBean LoginUser(UserBean user) {

        return userMapper.loginUser(user);
    }

    @Override
    public boolean deleteUser(String id) {
        if (blogMapper.findByUserId(id).size() == 0)
            return userMapper.deleteByPrimaryKey(id) == 1;
        else
            return blogMapper.deleteByUserKey(id) == 1 && userMapper.deleteByPrimaryKey(id) == 1;
    }

    @Override
    public int findPraiseById(String id) {
        int sum = 0;
        List<BlogBean> L = blogMapper.findByUserId(id);
        for (BlogBean b : L) {
            sum += b.getPraise();
        }
        return sum;
    }

    @Override
    public int updateUser(UserBean user) {
        return userMapper.updateUser(user);
    }
}