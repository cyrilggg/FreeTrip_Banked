package com.example.freetrip_banked.service;

import com.example.freetrip_banked.bean.LineBean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LineService {
    List<LineBean> findbycity(String city);
}
