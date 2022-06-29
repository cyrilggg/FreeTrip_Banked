package com.example.freetrip_banked;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
@MapperScan("com.example.freetrip_banked.mapper")
public class FreeTripBankedApplication {

    public static void main(String[] args) {
        SpringApplication.run(FreeTripBankedApplication.class, args);
    }

}
