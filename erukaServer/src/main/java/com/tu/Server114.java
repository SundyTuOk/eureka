package com.tu;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Server114 {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Server114.class).web(true).run(args);
    }
}
