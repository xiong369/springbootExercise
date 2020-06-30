package com.gb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.gb.dao")
@EnableCaching
public class SpringbootexerciseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootexerciseApplication.class, args);
    }

}
