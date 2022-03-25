package dev.sultanov.springboot.oauth2.mfa.controller.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello/init")
public class MyController {
    @GetMapping
    public String helloWorld(){
        return "hello world";
    }
}
