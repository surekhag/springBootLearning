package com.example.demo.service;

import com.example.demo.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    List<Product> findAll();
    Optional<Product> findById(Long id);
    Product create(Product product);
    Optional<Product> update(Long id, Product product);
    boolean delete(Long id);
}
