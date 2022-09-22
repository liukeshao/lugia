package com.didiglobal.turbo.engine.runner;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.didiglobal.turbo.engine")
@MapperScan(basePackages = {"com.didiglobal.turbo.engine.dao"})
public class TestEngineApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestEngineApplication.class, args);
    }
}
