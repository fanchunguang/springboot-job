package com.lagou;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lagou.mapper")
@SpringBootApplication
public class SpringbootJobApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJobApplication.class, args);
    }

}
