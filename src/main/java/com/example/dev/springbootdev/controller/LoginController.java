package com.example.dev.springbootdev.controller;

import com.example.dev.springbootdev.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/login")
    public String login(@RequestParam String name, @RequestParam String password) {
        if (authenticationService.authenticate(name, password))
            return "Successfully logged in !!!";
        else
            return "Wrong credentials !!!";
    }
}
