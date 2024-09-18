package com.example.db_lock_example.domain.usecases;

import com.example.db_lock_example.domain.Product;
import com.example.db_lock_example.domain.ports.in.ProductServicePort;
import com.example.db_lock_example.domain.ports.out.ProductsRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductServicePort {
    private final ProductsRepository productsRepository;

    ProductServiceImpl(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Override
    public void createProduct(Product product) {
        productsRepository.save(product);
    }

    @Override
    public void updateProduct(Product product) {
        // TODO Auto-generated method stub
    }

    @Override
    public void updateProductQuantity(Long id, int quantity) {
        Product product = productsRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));

        int newQuantity = product.quantity() + quantity;
        if (newQuantity < 0) {
            throw new RuntimeException("Not enough quantity");
        }

        Product newProduct = new Product(product.id(), product.name(), newQuantity);
        productsRepository.save(newProduct);
    }

    @Override
    public void deleteProduct(Long id) {
        // TODO Auto-generated method stub
    }

    @Override
    public void getProduct(Long id) {
        // TODO Auto-generated method stub
    }

    @Override
    public void getAllProducts() {
        // TODO Auto-generated method stub
    }
}
