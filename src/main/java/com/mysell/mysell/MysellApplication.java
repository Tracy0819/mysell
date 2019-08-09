package com.mysell.mysell;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.mysell.mysell.Dao.mapper")
public class MysellApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysellApplication.class, args);
    }

}
