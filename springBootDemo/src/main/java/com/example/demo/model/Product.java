package com.example.demo.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Product {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDate expiryDate;

    public Product() {}

    public Product(Long id, String name, String description, BigDecimal price, LocalDate expiryDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public LocalDate getExpiryDate() {
        return expiryDate;
    }
    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
}   
