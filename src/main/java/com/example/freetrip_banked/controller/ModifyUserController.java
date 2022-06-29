package com.example.freetrip_banked.controller;

import com.example.freetrip_banked.service.UserService;
import com.example.freetrip_banked.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class ModifyUserController {
    @Autowired
    private UserService userService;

    @Autowired
    private BlogService blogService;

    @RequestMapping("/delete/{id}")
    public Map deleteUserByBlog(@PathVariable("id")String  id){
        Map<String,String> map = new HashMap<>();

        if (userService.deleteUser(id)){
            map.put("msg","delete successful!");
            map.put("code","200");
        }else{
            map.put("msg","delete error!");
        }
        return map;
    }

    @RequestMapping("/pra/{id}")
    public Map getPraise(@PathVariable("id")String  id){
        Map<String,String> map = new HashMap<>();
        int num = userService.findPraiseById(id);
        if (num >= 0){
            map.put("code","200");
            map.put("data", String.valueOf(num));
        }else{
            map.put("msg","delete error!");
        }
        return map;
    }
}
