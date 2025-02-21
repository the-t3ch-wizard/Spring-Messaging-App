package com.spring.spring_messaging_app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloPutRestController {

    @PutMapping("/hello/put/{firstName}/")
    public String putHello(@PathVariable String firstName, @RequestParam(value = "lastName") String lastName){
        return "Hello "+firstName+" "+lastName;
    }

}
