package com.spring.spring_messaging_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("hello")
    public String getHello(){
        return "Hello";
    }

}
