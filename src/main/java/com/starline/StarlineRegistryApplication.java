package com.starline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StarlineRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarlineRegistryApplication.class, args);
	}

}
