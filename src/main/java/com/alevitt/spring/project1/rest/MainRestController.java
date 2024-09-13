package com.alevitt.spring.project1.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

    // inject properties
    @Value("${player.name}")
    private String playerName;

    @Value("${group.name}")
    private String groupName;

    @GetMapping("/userinfo")
    public String getUserInfo() {
        return "User: " + playerName + " from group: " + groupName;
    }

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
