package com.example.orderservice.Client;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerClient {

    private final RestTemplate restTemplate;

    public CustomerClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @CircuitBreaker(name = "customerService", fallbackMethod = "fallbackCustomer")
    @Retry(name = "customerService")
    public String getCustomerName(Long customerId) {
        return restTemplate.getForObject("http://localhost:8080/customers/" + customerId, String.class);
    }

    public String fallbackCustomer(Long customerId, Throwable t) {
        return "Unknown-Customer";
    }
}

