package com.example.bigbasket_ecom.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bigbasket_ecom.Model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Optional<Product> findById(int id);
    Product deleteById(int id);
    List<Product> findAllBycategoryId(int categoryId);
    List<Product> findAllByProductName(String productName);
    
}
