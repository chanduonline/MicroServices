package com.chanduonline.RatingCourseService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class RatingCourseServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RatingCourseServiceApplication.class, args);
	}

}
