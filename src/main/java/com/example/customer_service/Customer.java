package com.example.customer_service;

import java.util.List;

public record Customer(
        int customerId,
        String name,
        List<Integer> accountIdList
) {
}
