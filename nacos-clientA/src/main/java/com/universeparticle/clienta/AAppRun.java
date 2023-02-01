package com.universeparticle.clienta;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableDubbo

public class AAppRun {
    public static void main(String[] args) {
        System.out.println("a");
        SpringApplication.run(AAppRun.class,args);
    }
}
