package com.example.db_lock_example.domain.ports.in;

import com.example.db_lock_example.domain.Product;

public interface ProductServicePort {
    void createProduct(Product product);
    void updateProduct(Long id, String name, int quantity);
    void deleteProduct(Long id);
    void getProduct(Long id);
    void getAllProducts();
}
