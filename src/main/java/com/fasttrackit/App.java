package com.fasttrackit;


import java.time.LocalDate;

public class App
{
    public static void main( String[] args ){
        Animal dog1 = new Animal();
        dog1.setName("Rex");
        dog1.setAge(2);
        dog1.setFavoriteFood("Pedigri");
        dog1.setFavoriteRecreationActivity("Running");
        dog1.setAge(2);
        dog1.setHealthLevel(10);
        dog1.setFavoriteFood("Pedigri");
        dog1.setHungryLevel(1);
        dog1.setSpiritLevel(10);

        Food dogFood1 = new Food();
        dogFood1.setAmount(500);
        dogFood1.setAvailability(true);
        dogFood1.setPrice(25.50);

        RecreationActivity running = new RecreationActivity();


        Adopter adopter1 = new Adopter();
        adopter1.setName("David");
        adopter1.setAvailableMoney(500);

        Vet dogvet = new Vet();
        dogvet.setSpecialization("DoggoDoctor");
        dogvet.setName("Joe");



    }


}
