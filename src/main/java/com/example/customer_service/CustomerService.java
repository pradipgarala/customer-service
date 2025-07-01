package com.example.customer_service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerService {
    private final AccountClient accountClient;

    public List<Customer> getCustomers() {
        return List.of(
                new Customer(1, "alice", List.of(1, 2)),
                new Customer(11, "bob", List.of(11, 12))
        );
    }

    public List<CustomerDto> getCustomersWithAccounts() {
        return getCustomers().stream()
                .map(c -> new CustomerDto(c.customerId(), c.name(), accountClient.getAccountsByCustomerId(c.customerId())))
                .toList();
    }
}
