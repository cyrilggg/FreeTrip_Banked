package com.example.freetrip_banked;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.example.freetrip_banked.mapper")
@SpringBootApplication
public class TouristApplication {

    public static void main(String[] args) {
        SpringApplication.run(TouristApplication.class, args);
        System.out.println("程序正在运行...");
    }

}
