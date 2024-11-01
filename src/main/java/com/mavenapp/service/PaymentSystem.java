package com.mavenapp.service;

public abstract class PaymentSystem implements Payable{

    protected double amount;

    public PaymentSystem(double amount) {
        this.amount = amount;
    }
}
