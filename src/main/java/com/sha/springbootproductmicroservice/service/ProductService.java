package com.sha.springbootproductmicroservice.service;

import com.sha.springbootproductmicroservice.model.Product;
import com.sha.springbootproductmicroservice.repository.IProductRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ProductService  implements IProductService {
    private final IProductRepository productRepository;

    public ProductService(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @Override
    public Product saveProduct(Product product) {
        product.setCreated_at(LocalDateTime.now());
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
        } else {
            throw new IllegalArgumentException("Product with id " + id + " does not exist");
        }
    }

    @Override
    public boolean existsById(Long id) {
        return productRepository.existsById(id);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }
}
