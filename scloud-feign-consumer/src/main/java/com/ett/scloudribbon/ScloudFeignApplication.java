package com.ett.scloudribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.ett.service")
@SpringBootApplication
@EnableAutoConfiguration
@EnableCircuitBreaker
@ComponentScan(basePackages="com.ett")
public class ScloudFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScloudFeignApplication.class, args);
	}
}
