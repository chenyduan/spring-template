package com.universeparticle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSecurityController {

    @GetMapping("/userinfo")
    public String  test(){
        System.out.println("resource-server返回的加密信息");
        return "resource-server返回的加密信息";
    }
}
