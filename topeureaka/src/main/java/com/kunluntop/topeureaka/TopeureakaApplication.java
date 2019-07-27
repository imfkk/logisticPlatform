package com.kunluntop.topeureaka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TopeureakaApplication {

    public static void main(String[] args) {
        SpringApplication.run(TopeureakaApplication.class, args);
    }

}
