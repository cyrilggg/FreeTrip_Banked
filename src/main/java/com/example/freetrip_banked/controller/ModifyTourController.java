package com.example.freetrip_banked.controller;

import com.example.freetrip_banked.bean.TourBean;
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
     * @return: java.util.List<com.example.test.bean.BookBean>
     */
    @GetMapping("/list")
    public String showBlogs() {
        List<TourBean> BlogList = tourService.queryAllBlog();
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
    public Map addBlog(@RequestBody TourBean tourBean) {
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
     * @Description: 根据名称进行查询
     * @Param: [java.lang.String]
     * @return: com.example.test.bean.BookBean
     */
    @PostMapping("/search")
    public String queryBook(@RequestBody Map<String, Object> params) {
        TourBean tourBean = tourService.selectBlogByName(((String) params.get("name")));
        JSONObject result = new JSONObject();
        if (tourBean == null) {
            result.put("mas", "未查询到相关信息");
        } else {
            result.put("msg", "ok");
            result.put("data", tourBean);
        }
        return result.toJSONString();
    }

    /**
     * @Description: 点赞
     * @Param: [java.lang.String]
     * @return: com.example.test.bean.BookBean
     */
    @PostMapping("/blog/pra")
    public Map add_praise(@RequestBody Map<String, Object> params) {
        TourBean tourBean = tourService.selectBlogByName(((String) params.get("name")));
        JSONObject result = new JSONObject();
        if (tourBean == null) {
            result.put("mas", "未查询到相关信息");
        } else {
            result.put("msg", "ok");
            tourBean.set_praise(tourBean.get_praise() + 1);
        }
        return result;
    }


}
