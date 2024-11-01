package com.mavenapp.service;

public class DeliveryStandard implements Expediable{
    @Override
    public void send() {
        System.out.println("La commande expediee en livraison standard");
    }
}
