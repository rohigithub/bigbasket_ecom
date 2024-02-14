package com.example.bigbasket_ecom.Model;

public class CartProductDTO {
    private Cart cart;
    private Product product;

    // Getters and setters
    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
