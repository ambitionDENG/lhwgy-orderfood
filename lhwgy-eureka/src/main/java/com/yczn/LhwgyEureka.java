package com.yczn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class LhwgyEureka {

    public static void main(String[] args) {
        SpringApplication.run(LhwgyEureka.class, args);
    }
}