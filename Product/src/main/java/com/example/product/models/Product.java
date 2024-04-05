package com.example.product.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "products")
@AllArgsConstructor @NoArgsConstructor
@Getter
@Setter
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long id;

    private LocalDateTime orderDate;

    private String status;

    private String shippingAddress;
    @OneToOne
    private Customer customer;

    public Product(long id, LocalDateTime orderDate, String status, String shippingAddress) {
        this.id = id;
        this.orderDate = orderDate;
        this.status = status;
        this.shippingAddress = shippingAddress;
    }
}