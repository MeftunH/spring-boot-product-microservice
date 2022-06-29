package com.sha.springbootproductmicroservice.repository;

import com.sha.springbootproductmicroservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface IProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findById(Long id);
}
