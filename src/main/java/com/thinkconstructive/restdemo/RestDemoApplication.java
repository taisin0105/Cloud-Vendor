package com.thinkconstructive.restdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication		//@SpringBootApplication = @EnableAutoConfiguration + @ComponentScan + @Configuration
public class mRestDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(RestDemoApplication.class, args);
	}
}
