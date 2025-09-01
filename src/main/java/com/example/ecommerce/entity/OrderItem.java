package com.example.ecommerce.entity;

import org.springframework.data.mongodb.core.mapping.DBRef;

public class OrderItem {

    @DBRef
    private Product product;
    private int quantity;
    private String name;
    private double price;
    private String imageName;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Override
public String toString() {
    return "OrderItem{"
            + "product=" + product + ","
            + "quantity=" + quantity + ","
            + "name='" + name + "'",
            + "price=" + price + ","
            + "imageName='" + imageName + "'"
            + "}";
}
}
