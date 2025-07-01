package com.example.customer_service;

import java.util.List;

public record CustomerDto(
        int customerId,
        String name,
        List<Account> accountList
) {
}
