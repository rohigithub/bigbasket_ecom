package com.example.bigbasket_ecom.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bigbasket_ecom.Model.Product;
import com.example.bigbasket_ecom.Repository.ProductRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product updateProduct(int id, Product updatedProduct) {
        Product existingData = productRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Student not found with id: " + id));

                existingData.setProductName(updatedProduct.getProductName());
                existingData.setProductSku(updatedProduct.getProductSku());
                existingData.setProductPrice(updatedProduct.getProductPrice());
                existingData.setProductShortName(updatedProduct.getProductShortName());
                existingData.setProductDescription(updatedProduct.getProductDescription());
                existingData.setDeliveryTimeSpan(updatedProduct.getDeliveryTimeSpan());
                existingData.setCategoryId(updatedProduct.getCategoryId());
                existingData.setProductImageUrl(updatedProduct.getProductImageUrl());
        return productRepository.save(existingData);
    }

    
}
