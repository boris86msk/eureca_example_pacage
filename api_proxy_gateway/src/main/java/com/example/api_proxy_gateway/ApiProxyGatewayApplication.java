package com.example.api_proxy_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ApiProxyGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiProxyGatewayApplication.class, args);
    }

}
