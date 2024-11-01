package com.mavenapp.entity;

public class Client extends User{

    public Client(long id, String name, String email) {
        super(id, name, email);
    }

    public void order(){
        System.out.println("Commande passer par le client "+ getName()+" .");
    }
}
