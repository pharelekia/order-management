package com.mavenapp.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Order {

    private List<Product> products;
    private User user;

    public Order(User user) {
        this.user = user;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public double calculateTotal(){
        return products.stream().mapToDouble(Product::calculatePrice).sum();
    }

    public List<Product> getProducts(){
        return products;
    }

    @Override
    public String toString() {
        return "OrderUser{" +
                "user=" + user.getName() +
                ",products=" + products.stream().map(Product::getName).
                collect(Collectors.joining(" ,")) + " , total=$ "+ calculateTotal() +
                '}';
    }
}
