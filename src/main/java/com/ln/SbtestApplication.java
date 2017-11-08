package com.ln;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.ln"})
@MapperScan(basePackages = {"com.ln.dao"})
public class SbtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbtestApplication.class, args);
	}
}
