package com.alevitt.spring.project1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

    @GetMapping("/")
    public String sayHello() {
        return "Welcome to Spring Boot!";
    }

    @GetMapping("/rest")
    public String getRest() {
        return "Current implemented endpoimts: / , /rest .";
    }

    @GetMapping("/peace")
    public String getPeace() {
        return "R.I.P";
    }
}
