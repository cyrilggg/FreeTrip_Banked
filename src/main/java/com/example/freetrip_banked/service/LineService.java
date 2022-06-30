package com.example.freetrip_banked.service;

import com.example.freetrip_banked.bean.LineBean;
import org.springframework.stereotype.Service;

import java.util.List;

public interface LineService {
    List<LineBean> queryByCity(String city);
}
