package com.example.orderservice.service;

import com.example.orderservice.Client.CustomerClient;
import com.example.orderservice.entity.Order;
import com.example.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CustomerClient customerClient;

    public Order createOrder(Order order) {
        Long customerId = Long.parseLong(order.getCustomerId());
        String customerName = customerClient.getCustomerName(customerId);

        // Lưu đơn hàng sau khi gọi sang customer service
        order.setNote("Created for: " + customerName);
        return orderRepository.save(order);
    }

//    public Order createOrder(Order order) {
//        String customerName = customerClient.getCustomerName(1L); // ví dụ customerId = 1
//        order.setCustomerName(customerName);
//        return orderRepository.save(order);
//    }

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
