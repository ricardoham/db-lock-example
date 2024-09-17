package com.example.db_lock_example.domain.usecases;

import com.example.db_lock_example.domain.Product;
import com.example.db_lock_example.domain.ports.in.ProductServicePort;
import com.example.db_lock_example.domain.ports.out.ProductsRepository;

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
    public void updateProduct(Long id, String name, int quantity) {
        // TODO Auto-generated method stub
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
