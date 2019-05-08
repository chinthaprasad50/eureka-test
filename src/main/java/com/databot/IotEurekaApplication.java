package com.databot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Application for Discovery server as Eureka
 */
@SpringBootApplication
@EnableEurekaServer
@EnableDiscoveryClient
public class IotEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(IotEurekaApplication.class, args);
	}
}
