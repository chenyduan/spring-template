package com.universeparticle.clienta.controller;

import com.universeparticle.clienta.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {


    @Autowired
    TestService testService;

    @GetMapping("/")
    public String test(){
        System.out.println("这里是a...");
        testService.test();
        return "这里是A";
    }

    @GetMapping("/test")
    public String test2(){
        return "test";
    }

}
