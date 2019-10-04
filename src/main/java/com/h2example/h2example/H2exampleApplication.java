package com.h2example.h2example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class H2exampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2exampleApplication.class, args);
	}

}
