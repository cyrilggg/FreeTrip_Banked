package com.example.freetrip_banked.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.freetrip_banked.bean.LineBean;
import com.example.freetrip_banked.service.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/home")
public class ModifyLineController {
    @Autowired
    LineService lineService;

    @GetMapping("/search/{city}")
    public JSONObject findbycity(@PathVariable("city")String city){
        List<LineBean> lines = lineService.queryByCity(city);
        JSONObject result = new JSONObject();
        if(lines == null){
            result.put("code",400);
            result.put("msg","search error!");
        }else {
            result.put("code",200);
            result.put("msg","search successful");
            result.put("data",lines);
        }
        return result;
    }
}
