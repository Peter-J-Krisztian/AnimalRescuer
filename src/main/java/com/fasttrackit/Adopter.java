package com.fasttrackit;

public class Adopter extends Person {
    public Adopter(String name){

    }

    public double getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney;
    }

    double availableMoney;
}
