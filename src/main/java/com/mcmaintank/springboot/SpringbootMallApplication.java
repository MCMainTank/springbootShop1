package com.mcmaintank.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.mcmaintank.springboot.model","com.mcmaintank.springboot.service","com.mcmaintank.springboot.controller"})
@MapperScan(basePackages = {"com.mcmaintank.springboot.mapper"})
@SpringBootApplication
public class SpringbootMallApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMallApplication.class, args);
    }

}
