package com.example.customer_service.feign;


import com.example.customer_service.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "account-service")
public interface AccountClient {

    @GetMapping("/accounts")
    List<Account> getAccounts();

    @GetMapping("/accounts/customers/{customerId}")
    List<Account> getAccountsByCustomerId(@PathVariable int customerId);

    @GetMapping
    String getApplicationName();
}