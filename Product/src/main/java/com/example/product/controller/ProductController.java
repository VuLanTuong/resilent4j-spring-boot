package com.example.product.controller;

import com.example.product.models.Product;
import com.example.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    public List<Product> getListProduct(){
        return (List<Product>) productRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Product> getUserById(@PathVariable(value = "id") long id){
        return productRepository.findById(id);
    }


}
