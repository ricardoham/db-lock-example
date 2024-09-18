package com.example.db_lock_example.adapter.rest.controller;

import com.example.db_lock_example.domain.Product;

public class ProductMapper {

    public static Product toProduct(ProductDTO productDTO) {
        return new Product(null, productDTO.name(), productDTO.quantity());
    }

    public static ProductDTO toProductDTO(Product product) {
        return new ProductDTO(product.name(), product.quantity());
    }
}