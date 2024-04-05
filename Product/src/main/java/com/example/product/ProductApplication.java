package com.example.product;

import com.example.product.models.Product;
import com.example.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductApplication {

    @Autowired
    private ProductRepository productRepository;



    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }
}
