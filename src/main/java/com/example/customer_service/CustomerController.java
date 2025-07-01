package com.example.customer_service;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping("/accounts")
    List<CustomerDto> getCustomersWithAccounts() {
        return customerService.getCustomersWithAccounts();
    }

}
