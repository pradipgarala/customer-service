package com.example.customer_service;

import com.example.customer_service.feign.AccountClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class HomeController {

    private final AccountClient accountClient;

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    private String port;

    @GetMapping
    String getApplicationName() {
        return "%s: %s".formatted(applicationName, port);
    }

    @GetMapping("/load-balancer")
    String getAccountApplicationName() {
        return accountClient.getApplicationName();
    }
}
