package com.mavenapp.entity;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> products;

    public Cart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public void deleteProduct(Product product){
        this.products.remove(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void cleanCart(){
        this.products.clear();
    }

    public double calculateTotal(){
        return products.stream().mapToDouble(Product::calculatePrice).sum();
    }
}
