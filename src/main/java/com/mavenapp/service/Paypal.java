package com.mavenapp.service;

public class Paypal extends PaymentSystem{
    public Paypal(double amount) {
        super(amount);
    }

    @Override
    public void pay() {
        System.out.println("Paiement de $ "+amount+" via paypal");
    }
}
