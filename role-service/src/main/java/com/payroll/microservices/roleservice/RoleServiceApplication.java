package com.payroll.microservices.roleservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class RoleServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoleServiceApplication.class, args);
	}

}
