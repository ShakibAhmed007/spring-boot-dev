package com.example.dev.springbootdev.controller;

import com.example.dev.springbootdev.config.CurrencyServiceConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

    @Autowired
    private CurrencyServiceConfiguration cureCurrencyServiceConfiguration;

    @GetMapping("/getCurrency")
    public CurrencyServiceConfiguration getCurrencyConfig(){
        return cureCurrencyServiceConfiguration;
    }
}
