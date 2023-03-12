package com.example.eurekaservice2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaService2Application {

    public static void main(String[] args) {
        SpringApplication.run(EurekaService2Application.class, args);
    }

}
