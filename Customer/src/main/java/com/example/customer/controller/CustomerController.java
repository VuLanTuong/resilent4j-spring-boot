package com.example.customer.controller;

import com.example.customer.models.Customer;
import com.example.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/getAll")
    List<Customer> getListUser(){
        return (List<Customer>) customerRepository.findAll();
    }
    @GetMapping("/{id}")
    Customer getCustomerById(@PathVariable long id){
        return customerRepository.getCustomerById(id);
    }
}
