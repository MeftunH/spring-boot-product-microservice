package com.sha.springbootproductmicroservice.service;

import com.sha.springbootproductmicroservice.model.Product;

import java.util.List;

public interface IProductService{
     Product saveProduct(Product product);
     void deleteProduct(Long id);

    boolean existsById(Long id);

    List<Product> findAll();
}
