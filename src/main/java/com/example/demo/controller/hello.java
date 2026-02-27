package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/api/")
@RestController
public class hello {
    @GetMapping("hello")
    public String helloWorld(){
        return "hello";
    }
    @GetMapping("hi")
    public String hi(){
        return "hi";
    }
}
