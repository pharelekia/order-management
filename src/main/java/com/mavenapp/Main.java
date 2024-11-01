package com.mavenapp;

import com.mavenapp.entity.*;
import com.mavenapp.service.CardCredit;
import com.mavenapp.service.DeliveryStandard;
import com.mavenapp.service.Expediable;
import com.mavenapp.service.PaymentSystem;

public class Main {
    public static void main(String[] args) {

        // Creation d'un utilisateur
        User user = new User(1,"Romeo","romeo@gmail.com");

        // creation des produits
        Product product1 = new Product(1,"Yema",20.0,1);
        Product product2 = new Product(1,"Timex",5.0,2);
        Product product3 = new Product(1,"Rado",10.0,1);

        // Creation d'un panier
        Cart cart = new Cart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);

        // Affichage du total du panier
        System.out.println("Total du panier: $"+ cart.calculateTotal());

        // Creation de la commande
        Order order = new Order(user);
        order.addProduct(product1);
        order.addProduct(product2);
        order.addProduct(product3);

        // Affichage de la commande
        System.out.println(order);

        // Choix d'un moyen de paiement
        PaymentSystem paymentSystem = new CardCredit(order.calculateTotal());
        paymentSystem.pay();

        // Expedition de la commande
        Expediable expediable = new DeliveryStandard();
        expediable.send();
    }
}