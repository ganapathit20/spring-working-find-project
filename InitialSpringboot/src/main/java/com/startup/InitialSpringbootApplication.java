package com.startup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class InitialSpringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(InitialSpringbootApplication.class, args);
		System.out.println("spring boot started...");
	}

}
