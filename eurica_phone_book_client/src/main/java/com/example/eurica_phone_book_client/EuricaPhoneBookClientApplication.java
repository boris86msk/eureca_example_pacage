package com.example.eurica_phone_book_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EuricaPhoneBookClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EuricaPhoneBookClientApplication.class, args);
    }

}
