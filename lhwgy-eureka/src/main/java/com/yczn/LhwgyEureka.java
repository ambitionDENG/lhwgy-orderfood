package com.yczn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created with IntelliJ IDEA.
 *
 * @description:
 * @author: yz
 * @date: 2018-12-14
 * @time: 18:34
 * <p>
 * 通过@EnableConfigServer注解激活配置服务.
 * 说明：
 * 在application.yml中有个git.uri的配置，目前配置的是https://github.com/eacdy/spring-cloud-study/
 * 获取git上的资源信息遵循如下规则：
 * /{application}/{profile}[/{label}]
 * /{application}-{profile}.yml
 * /{label}/{application}-{profile}.yml
 * /{application}-{profile}.properties
 * /{label}/{application}-{profile}.properties
 * / {应用名}/{环境名}[/{分支名}]
 * /{应用名}-{环境名}.yml
 * /{应用名}-{环境名}.properties
 * /{分支名}/{应用名}-{环境名}.yml
 * /{分支名}/{应用名}-{环境名}.properties
 * 例如本例：可使用以下路径来访问microservice-config-client-dev.properties：
 * http://localhost:8040/microservice-config-client-dev.properties
 * http://localhost:8040/microservice-config-client/dev
 */

@EnableConfigServer
@SpringBootApplication
@EnableEurekaServer
public class LhwgyEureka {

    public static void main(String[] args) {
        SpringApplication.run(LhwgyEureka.class, args);
    }
}