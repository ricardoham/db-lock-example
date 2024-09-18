package com.example.db_lock_example.adapter.rest.controller;

import com.example.db_lock_example.domain.Product;
import com.example.db_lock_example.domain.ports.in.ProductServicePort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductServicePort productService;

    public ProductController(ProductServicePort productService) {
        this.productService = productService;
    }

    @PostMapping
    public void createProduct(ProductDTO productDTO) {
        Product product = ProductMapper.toProduct(productDTO);
        productService.createProduct(product);
    }

    @PostMapping("/{id}/update-quantity")
    public ResponseEntity<String> updateQuantity(
            @PathVariable Long id,
            @RequestParam int quantity) {

        productService.updateProductQuantity(id, quantity);
        return ResponseEntity.ok("Product quantity updated successfully");
    }

}
