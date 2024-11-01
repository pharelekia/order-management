package com.mavenapp.service;

public interface Payable {

    void pay();

    default void ShowRecap(){
        System.out.println("Recapulatif de la commande");
    }

    static void checkPayment(){
        System.out.println("Verification du paiement en cours...");
    }
}
