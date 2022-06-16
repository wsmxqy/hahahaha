package com.neuedu.his;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.neuedu.his.dao"})
public class CheckApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CheckApiApplication.class, args);
    }

}
