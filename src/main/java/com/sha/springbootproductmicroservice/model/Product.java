package com.sha.springbootproductmicroservice.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name",length = 100, nullable = false)
    private String name;

    @Column(name = "price",nullable = false)
    private Double price;

    @Column(name="created_at",nullable = false)
    private LocalDateTime created_at;
}
