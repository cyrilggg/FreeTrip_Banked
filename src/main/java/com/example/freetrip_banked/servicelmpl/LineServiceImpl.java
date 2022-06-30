package com.example.freetrip_banked.servicelmpl;

import com.example.freetrip_banked.mapper.LineMapper;
import com.example.freetrip_banked.bean.LineBean;
import com.example.freetrip_banked.service.LineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.*;
import java.util.List;

public class LineServiceImpl {
    private LineMapper lineMapper;
    List<LineBean> findbycity(String city){
        return lineMapper.findbycity(city);
    }
}
