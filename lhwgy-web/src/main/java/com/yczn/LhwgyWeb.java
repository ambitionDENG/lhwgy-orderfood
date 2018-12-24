package com.yczn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: yz
 * @date: 2018-12-15
 * @time: 15:17
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class LhwgyWeb {
    public static void main(String[] args) {
        SpringApplication.run(LhwgyWeb.class, args);
    }
}
