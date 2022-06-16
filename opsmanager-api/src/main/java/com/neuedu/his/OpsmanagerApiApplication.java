package com.neuedu.his;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.neuedu.his.dao"})
public class OpsmanagerApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpsmanagerApiApplication.class, args);
    }

}
