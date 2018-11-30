package com.example.mapperdome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.example.mapperdome.mapper")
public class MapperdomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MapperdomeApplication.class, args);
    }
}
