package com.example.demo.service;

import com.example.demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class ProductServiceImpl implements ProductService {

    private final ConcurrentHashMap<Long, Product> store = new ConcurrentHashMap<>();
    private final AtomicLong idGenerator = new AtomicLong(0);

    @Override
    public List<Product> findAll() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Product create(Product product) {
        long id = idGenerator.incrementAndGet();
        product.setId(id);
        store.put(id, product);
        return product;
    }

    @Override
    public Optional<Product> update(Long id, Product product) {
        return Optional.ofNullable(store.computeIfPresent(id, (k, existing) -> {
            existing.setName(product.getName());
            existing.setDescription(product.getDescription());
            existing.setPrice(product.getPrice());
            existing.setExpiryDate(product.getExpiryDate());
            return existing;
        }));
    }

    @Override
    public boolean delete(Long id) {
        return store.remove(id) != null;
    }
}
