package com.universeparticle.clientb;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
@EnableDubbo
public class BAppRun {
    public static void main(String[] args) {
        SpringApplication.run(BAppRun.class,args);
    }
}
