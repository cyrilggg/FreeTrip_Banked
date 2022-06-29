package com.example.freetrip_banked.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.freetrip_banked.bean.User;
import com.example.freetrip_banked.service.UserService;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/user")
public class ModifyUserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Map addUser(@RequestBody User user) {
        int flag = userService.addUser(user);
        Map<String, Object> map = new HashMap<String, Object>();
        if (flag == 1) {
            map.put("msg", "register successfully!");
            map.put("code", "200");
        } else {
            map.put("msg", "error!");
            map.put("code", "400");
        }
        return map;
    }

    @PostMapping("/login")
    public String LoginUser(@RequestBody User user) {
        User u = userService.LoginUser(user);
        JSONObject result = new JSONObject();
        if (u!=null) {
            result.put("msg", "ok");
            result.put("data", u);
        } else {
            result.put("msg", "error!");
        }
        return result.toJSONString();
    }
}
