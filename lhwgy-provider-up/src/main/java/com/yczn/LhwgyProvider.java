package com.yczn;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.yczn.mapper")
public class LhwgyProvider {

    public static void main(String[] args) {
        new SpringApplicationBuilder(LhwgyProvider.class).web(true).run(args);
    }

}
