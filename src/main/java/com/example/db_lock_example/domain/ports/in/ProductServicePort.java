package com.example.db_lock_example.domain.ports.in;

import com.example.db_lock_example.domain.Product;

public interface ProductServicePort {
    void createProduct(Product product);
    void updateProduct(Product product);
    void updateProductQuantity(Long id, int quantity);
    void deleteProduct(Long id);
    void getProduct(Long id);
    void getAllProducts();
}
