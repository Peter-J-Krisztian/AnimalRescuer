package com.fasttrackit;


import java.time.LocalDate;

public class App
{
    public static void main( String[] args ){
        Animal dog1 = new Animal("David",2);
        dog1.setFavoriteFood("Pedigri");
        dog1.setFavoriteRecreationActivity("Running");
        dog1.setAge(2);
        dog1.setHealthLevel(10);
        dog1.setFavoriteFood("Pedigri");
        dog1.setHungryLevel(1);
        dog1.setSpiritLevel(10);

        Food dogFood1 = new Food("Pedigiri");
        dogFood1.setAmount(500);
        dogFood1.setAvailability(true);
        dogFood1.setPrice(25.50);
        dogFood1.setExpirationDate(25);

        RecreationActivity running = new RecreationActivity("running");


        Adopter adopter1 = new Adopter("David");
        adopter1.setAvailableMoney(500);

        Vet dogvet = new Vet("Dr.Phil");
        dogvet.setSpecialization("DoggoDoctor");



    }


}
