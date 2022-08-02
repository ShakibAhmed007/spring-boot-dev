package com.example.dev.springbootdev.service;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String name, String password){
        return name.equalsIgnoreCase("skb") && password.equals("12345");
    }
}
