package com.spring.spring_messaging_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloParamRestController {

    @GetMapping("/hello/param/{name}")
    public String getHello(@PathVariable String name){
        return "Hello "+name;
    }

}
