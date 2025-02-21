package com.spring.spring_messaging_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloQueryRestController {

    @GetMapping("/hello/query")
    public String getHello(@RequestParam(value = "name") String name){
        return "Hello "+name;
    }

}
