package com.example.customer_service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "account-client", url = "http://localhost:8080/accounts")
public interface AccountClient {

    @GetMapping
    List<Account> getAccounts();

    @GetMapping("/customers/{customerId}")
    List<Account> getAccountsByCustomerId(@PathVariable int customerId);
}