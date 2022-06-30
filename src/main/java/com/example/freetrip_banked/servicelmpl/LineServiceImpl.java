package com.example.freetrip_banked.servicelmpl;

import com.example.freetrip_banked.mapper.LineMapper;
import com.example.freetrip_banked.bean.LineBean;
import com.example.freetrip_banked.service.LineService;
import org.springframework.stereotype.Service;

import java.lang.*;
import java.util.List;

@Service
public class LineServiceImpl implements LineService {
    private LineMapper lineMapper;
    public List<LineBean> queryByCity(String city){
        return lineMapper.findByCity(city);
    }
}
