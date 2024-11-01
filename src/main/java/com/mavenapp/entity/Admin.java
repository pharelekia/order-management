package com.mavenapp.entity;

public class Admin extends User{

    public Admin(long id, String name, String email) {
        super(id, name, email);
    }

    public void manageProduct(Product product){
        System.out.println("Produit gere par admin "+getName()+" :"+ product.getName());
    }
}
