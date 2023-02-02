package com.universeparticle.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestOauthClientController {


    @GetMapping("/test")
    public String test(){
        System.out.println("OAuth2.0 Client ..........");
        return "Oauth2 client 返回";
    }
}
