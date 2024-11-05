package com.example.springSecurity.controller;

import com.example.springSecurity.model.Users;
import com.example.springSecurity.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("/register")
    public Users register(@RequestBody Users users){
        return service.register(users);
    }

    @PostMapping("/login")
    public String login(@RequestBody Users user){
        return service.verify(user);
    }
}
