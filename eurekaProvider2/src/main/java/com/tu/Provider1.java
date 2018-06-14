package com.tu;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class Provider1 {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Provider1.class).web(true).run(args);
    }

    @GetMapping("/test1")
    public String test1(HttpServletRequest request) {
        return request.getRequestURL() + ":provider2:" + "test1";
    }
}
