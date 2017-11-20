package com.ett.scloudprovidercalculate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.ComponentScan;

@EnableDiscoveryClient
@SpringBootApplication
@EnableAutoConfiguration
@EnableCircuitBreaker
@ComponentScan(basePackages="com.ett.controller")
public class ScloudProviderCalculateApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScloudProviderCalculateApplication.class, args);
	}
}
