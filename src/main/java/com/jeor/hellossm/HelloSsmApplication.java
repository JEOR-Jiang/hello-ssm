package com.jeor.hellossm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jeor.hellossm.mapper")
public class HelloSsmApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSsmApplication.class, args);
	}

}
