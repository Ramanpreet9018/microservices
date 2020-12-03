package com.learning.photoapp.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //Registers the application as Eureka Server
public class PhotoAppDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppDiscoveryServiceApplication.class, args);
	}

}
