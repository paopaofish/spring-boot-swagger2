package com.example.springbootswagger2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.example.springbootswagger2.mapper")
public class SpringBootSwagger2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSwagger2Application.class, args);
	}
}
