package com.kunluntop.topeureak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TopeureakApplication {

    public static void main(String[] args) {
        SpringApplication.run(TopeureakApplication.class, args);
    }

}
