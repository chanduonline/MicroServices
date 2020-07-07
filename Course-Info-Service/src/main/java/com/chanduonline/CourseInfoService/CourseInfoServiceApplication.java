package com.chanduonline.CourseInfoService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CourseInfoServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseInfoServiceApplication.class, args);
	}

}
