package com.example.orderservice.Client;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.retry.annotation.Retry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CustomerClient {

    @Autowired
    private RestTemplate restTemplate;

    private static final String CUSTOMER_SERVICE_URL = "http://localhost:8080/customers/";

//    @CircuitBreaker(name = "customerService", fallbackMethod = "fallbackCustomer")
//    @Retry(name = "customerService")
    @Retry(name = "customerService", fallbackMethod = "fallbackCustomer")
    public String getCustomerName(Long customerId) {
        String url = CUSTOMER_SERVICE_URL + customerId;
        return restTemplate.getForObject(url, String.class);
    }

    public String fallbackCustomer(Long customerId, Throwable t) {
        return "Unknown Customer (fallback)";
    }
}


