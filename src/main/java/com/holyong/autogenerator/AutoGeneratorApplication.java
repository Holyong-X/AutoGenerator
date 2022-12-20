package com.holyong.autogenerator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.holyong"})
@MapperScan(basePackages = "com.holyong.autogenerator.mapper")
@SpringBootApplication
public class AutoGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutoGeneratorApplication.class, args);
    }

}
