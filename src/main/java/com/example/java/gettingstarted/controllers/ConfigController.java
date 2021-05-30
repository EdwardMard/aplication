package com.example.java.gettingstarted.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@Slf4j
public class ConfigController {


    @GetMapping("/")
    public String home() {
        log.info("Request processed!");
        return "Hello World!";
    }
}
