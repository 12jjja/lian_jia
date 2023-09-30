package com.example.lian_jia;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.lian_jia.mapper")
public class LianJiaApplication {
    public static void main(String[] args) {
        SpringApplication.run(LianJiaApplication.class, args);
    }

}