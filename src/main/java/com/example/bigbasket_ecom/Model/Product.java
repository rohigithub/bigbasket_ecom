package com.example.bigbasket_ecom.Model;

import jakarta.persistence.*;

@Entity
@Table(name="products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    
    private String productName;

    @Column(unique = true)
    private String productShortName;
    
    private String productSku,productDescription, createdDate,deliveryTimeSpan,productImageUrl;
    private int productPrice,categoryId;

    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public String getProductSku() {
        return productSku;
    }
    public void setProductSku(String productSku) {
        this.productSku = productSku;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductShortName() {
        return productShortName;
    }
    public void setProductShortName(String productShortName) {
        this.productShortName = productShortName;
    }
    public String getProductDescription() {
        return productDescription;
    }
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    public String getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }
    public String getDeliveryTimeSpan() {
        return deliveryTimeSpan;
    }
    public void setDeliveryTimeSpan(String deliveryTimeSpan) {
        this.deliveryTimeSpan = deliveryTimeSpan;
    }
    public String getProductImageUrl() {
        return productImageUrl;
    }
    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }
    public int getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
    @Override
    public String toString() {
        return "Product [productId=" + productId + ", productSku=" + productSku + ", productName=" + productName
                + ", productShortName=" + productShortName + ", productDescription=" + productDescription
                + ", createdDate=" + createdDate + ", deliveryTimeSpan=" + deliveryTimeSpan + ", productImageUrl="
                + productImageUrl + ", productPrice=" + productPrice + ", categoryId=" + categoryId + "]";
    }
    

    
    

}
