package com.itcast.hjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HjhRurakeClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(HjhRurakeClientApplication.class,args);
    }
}
