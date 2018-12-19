package com.yczn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LhwgyProviderUp {
  public static void main(String[] args) {
    SpringApplication.run(LhwgyProviderUp.class, args);
  }
}
