package com.yczn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: yz
 * @date: 2018-12-14
 * @time: 18:34
 */
@SpringBootApplication
@EnableDiscoveryClient
public class LhwgyProvider {

    public static void main(String[] args) {
        SpringApplication.run(LhwgyProvider.class, args);
    }
}