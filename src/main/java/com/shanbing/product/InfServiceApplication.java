package com.shanbing.product;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


/**
 * Created by shanbing on 2018/3/24.
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class InfServiceApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(InfServiceApplication.class).web(true).run(args);
    }
}
