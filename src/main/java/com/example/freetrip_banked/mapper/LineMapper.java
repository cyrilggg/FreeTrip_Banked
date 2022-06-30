package com.example.freetrip_banked.mapper;

import com.example.freetrip_banked.bean.LineBean;

import java.util.List;

public interface LineMapper {
    List<LineBean> findbycity(String city);
}
