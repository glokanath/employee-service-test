package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(exclude= {SecurityAutoConfiguration.class})
@SpringBootApplication
public class EmployeeServiceTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeServiceTestApplication.class, args);
	}

}
