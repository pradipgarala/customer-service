package com.example.customer_service;

public record Account(
        int accountId,
        int customerId,
        int balance
) {
}
