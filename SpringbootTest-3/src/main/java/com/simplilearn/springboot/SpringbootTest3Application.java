package com.simplilearn.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringbootTest3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTest3Application.class, args);
	}

}
