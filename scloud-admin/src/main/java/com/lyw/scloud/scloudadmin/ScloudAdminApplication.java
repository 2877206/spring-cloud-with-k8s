package com.lyw.scloud.scloudadmin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableAdminServer
@EnableAutoConfiguration
@EnableDiscoveryClient
public class ScloudAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScloudAdminApplication.class, args);
    }
}