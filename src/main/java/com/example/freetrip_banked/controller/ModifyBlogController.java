package com.example.freetrip_banked.controller;


import com.alibaba.fastjson.JSONObject;
import com.example.freetrip_banked.bean.BlogBean;
import com.example.freetrip_banked.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/myblog")
public class ModifyBlogController {

        @Autowired
        BlogService blogService;

        @DeleteMapping("/delete/{id}")
        public Map dropBlog(@PathVariable("id")String id){
            int flag = blogService.deleteBlog(id);
            Map<String,Object>map=new HashMap<>();
            if(flag==1){
                map.put("msg","successful!");
                map.put("code",200);
                map.put("data",0);
            }else{
                map.put("msg","delete error!");
            }
            return map;
        }
         @PostMapping("/search")
         public  JSONObject queryBlog(@RequestBody BlogBean blogBean){
            List<BlogBean> blogs = blogService.queryBlogById(String.valueOf(blogBean.getUserId()));
            JSONObject result=new JSONObject();
            if(blogs==null){
                result.put("msg","search error!");
            }else {
                result.put("msg","search successful");
                result.put("data",blogs);
            }
            return result;
         }
    }
