package com.example.orderservice.service;

import com.example.orderservice.Client.CustomerClient;
import com.example.orderservice.entity.Order;
import com.example.orderservice.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    private final OrderRepository orderRepository;
    private final CustomerClient customerClient;

    public OrderService(OrderRepository orderRepository, CustomerClient customerClient) {
        this.orderRepository = orderRepository;
        this.customerClient = customerClient;
    }

    public Order createOrder(Order order) {
        String customerName = customerClient.getCustomerName(1L); // ví dụ customerId = 1
        order.setCustomerName(customerName);
        return orderRepository.save(order);
    }

//    public Order createOrder(Order order) {
//        return orderRepository.save(order);
//    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }
}
