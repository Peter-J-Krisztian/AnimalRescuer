package com.fasttrackit;

public class Animal {
    String name;
    int age;
    double healthLevel;
    double hungryLevel;
    double spiritLevel;
    String favoriteFood;
    String favoriteRecreationActivity;

    public Animal(String name,int age){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(double healthLevel) {
        this.healthLevel = healthLevel;
    }

    public double getHungryLevel() {
        return hungryLevel;
    }

    public void setHungryLevel(double hungryLevel) {
        this.hungryLevel = hungryLevel;
    }

    public double getSpiritLevel() {
        return spiritLevel;
    }

    public void setSpiritLevel(double spiritLevel) {
        this.spiritLevel = spiritLevel;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteRecreationActivity() {
        return favoriteRecreationActivity;
    }

    public void setFavoriteRecreationActivity(String favoriteRecreationActivity) {
        this.favoriteRecreationActivity = favoriteRecreationActivity;
    }
}
