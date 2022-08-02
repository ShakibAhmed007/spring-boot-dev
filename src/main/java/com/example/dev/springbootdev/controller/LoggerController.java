package com.example.dev.springbootdev.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoggerController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping("printLog")
    public String printLog() {
        logger.debug("Mode : Debug");
        logger.info("Mode : Info");
        logger.warn("Mode : Warn");
        logger.trace("Mode : Trace");
        logger.error("Mode : Error");

        return "Please check logs !!!";
    }
}
