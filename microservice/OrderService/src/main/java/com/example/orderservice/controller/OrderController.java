package com.example.orderservice.controller;

import com.example.orderservice.Client.CustomerClient;
import com.example.orderservice.entity.Order;
import com.example.orderservice.service.OrderService;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;
    private final CircuitBreakerRegistry circuitBreakerRegistry;
    private final CustomerClient customerClient;

    public OrderController(OrderService orderService, CircuitBreakerRegistry circuitBreakerRegistry, CustomerClient customerClient) {
        this.orderService = orderService;
        this.circuitBreakerRegistry = circuitBreakerRegistry;
        this.customerClient = customerClient;
    }

    @GetMapping
    public List<Order> getAll() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public Order getById(@PathVariable Long id) {
        return orderService.getOrderById(id).orElse(null);
    }

    @PostMapping
    public Order create(@RequestBody Order order) {
        return orderService.createOrder(order);
    }

    @PostMapping("/retry-test")
    public String retryTest(@RequestParam Long customerId) {
        return customerClient.getCustomerName(customerId);
    }
}