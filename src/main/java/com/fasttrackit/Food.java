package com.fasttrackit;

import java.time.LocalDate;

public class Food {
    private String name;
    private double price;
    private double amount;
    private LocalDate expirationDate;
    boolean availability;

    public boolean expirationDayCheck(LocalDate expirationDate, LocalDate now) {
        if (now.isBefore(expirationDate)) {
            System.out.println("isn't expired");
            return true;
        } else {
            System.out.println("is expired");
            return false;
        }
    }

    //setters & getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }


    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }



}
