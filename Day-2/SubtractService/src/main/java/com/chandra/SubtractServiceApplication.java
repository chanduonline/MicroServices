package com.chandra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SubtractServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubtractServiceApplication.class, args);
	}

}
