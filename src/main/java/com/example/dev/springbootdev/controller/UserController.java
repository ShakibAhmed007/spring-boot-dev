package com.example.dev.springbootdev.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/getData")
    public String getData(){
        return "TEst";
    }
}
