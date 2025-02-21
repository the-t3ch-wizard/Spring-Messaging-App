package com.spring.spring_messaging_app.controller;

import com.spring.spring_messaging_app.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloPostRestController {

    @PostMapping("/hello")
    public String postHello(@RequestBody User user){
        return "Hello "+ user.getFirstName() + " " + user.getLastName();
    }

}
