package com.example.freetrip_banked.controller;

import com.example.freetrip_banked.bean.BlogBean;
import com.example.freetrip_banked.service.TourService;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/tour")
public class ModifyTourController {

    @Autowired
    TourService tourService;
    /*
    /**
     * @Description: 查询所有的博客
     * @Param: [org.springframework.ui.ModelMap]
     */
    @GetMapping("/list")
    public String showBlogs() {
        List<BlogBean> BlogList = tourService.queryAllBlog();
        JSONObject result = new JSONObject();
        result.put("msg", "ok");
        result.put("data", BlogList);
        return result.toJSONString();
    }

    /**
     * @Description: 添加博客
     * @Param: [com.example.test.bean.BookBean]
     * @return: java.util.Map
     */
    @PostMapping("/blog/add")
    public Map addBlog(@RequestBody BlogBean tourBean) {
        int flag = tourService.addBlog(tourBean);
        Map<String, Object> map = new HashMap<>();
        if (flag == 1) {
            map.put("code", "200");
            map.put("msg", "successful!");
        } else {
            map.put("msg", "add error!");
        }
        return map;
    }

    /**
     * @Description: 点赞
     * @Param: [java.lang.String]
     * @return: com.example.test.bean.BookBean
     */
    @PostMapping("/blog/pra")
    public JSONObject add_praise(@RequestBody Map<String, Object> params) {
        int flag = tourService.add_praise((String.valueOf(params.get("id"))));
        JSONObject result = new JSONObject();
        if (flag == 0) {
            result.put("mas", "未查询到相关信息");
        } else {
            result.put("msg", "ok");
        }
        return result;
    }


}
