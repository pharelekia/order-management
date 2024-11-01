package com.mavenapp.service;

public class DeliveryExpress implements Expediable{
    @Override
    public void send() {
        System.out.println("La commande expediee en livraison express");
    }
}
