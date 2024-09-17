package com.example.db_lock_example.domain.ports.out;

import com.example.db_lock_example.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Product, Long> {
}
