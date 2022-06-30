package com.example.freetrip_banked.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.freetrip_banked.bean.UserBean;
import com.example.freetrip_banked.service.UserService;
import com.example.freetrip_banked.service.BlogService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/user")
public class ModifyUserController {
    @Autowired
    private UserService userService;

    @Autowired
    private BlogService blogService;

    @PostMapping("/register")
    public Map addUser(@RequestBody UserBean user) {
        int flag = userService.addUser(user);
        Map<String, Object> map = new HashMap<String, Object>();
        if (flag == 1) {
            map.put("code", "200");
            map.put("msg", "register successfully!");
        } else {
            map.put("code", "400");
            map.put("msg", "error!");
        }
        return map;
    }


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


    @PostMapping("/login")
    public String LoginUser(@RequestBody UserBean user) {
        UserBean u = userService.LoginUser(user);
        JSONObject result = new JSONObject();
        if (u != null) {
            result.put("msg", "ok");
            result.put("data", u);
        } else {
            result.put("msg", "error!");
        }
        return result.toJSONString();
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

    @PostMapping("/update")
    public String updateUser(@RequestBody UserBean user) {
        int u = userService.updateUser(user);
        JSONObject result = new JSONObject();
        if (u == 1) {
            result.put("msg", "ok");
            result.put("code", "200");
        } else {
            result.put("msg", "error!");
        }
        return result.toJSONString();
    }
}
