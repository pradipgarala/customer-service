package com.example.customer_service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    private String port;

    @GetMapping
    String getApplicationName() {
        return "%s: %s".formatted(applicationName, port);
    }
}
