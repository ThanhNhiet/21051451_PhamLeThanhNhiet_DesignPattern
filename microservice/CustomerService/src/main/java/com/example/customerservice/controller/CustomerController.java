package com.example.customerservice.controller;

import com.example.customerservice.entity.Customer;
import com.example.customerservice.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable Long id) {
        return customerService.getCustomerById(id);
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<String> getCustomerById(@PathVariable String id) {
//        // Cố tình tạo lỗi để test retry
//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Simulated failure");
//    }
}
