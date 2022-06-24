package com.sha.springbootproductmicroservice.repository;

import com.sha.springbootproductmicroservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepository extends JpaRepository<Product, Long> {
}
