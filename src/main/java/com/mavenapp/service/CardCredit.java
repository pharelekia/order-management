package com.mavenapp.service;

public class CardCredit extends PaymentSystem{

    public CardCredit(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Paiement de $ "+amount+" par la carte credit");
    }
}
