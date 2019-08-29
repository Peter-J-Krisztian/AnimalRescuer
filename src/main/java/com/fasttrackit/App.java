package com.fasttrackit;


import java.time.LocalDate;

public class App
{
    public static void main( String[] args ){
        Animal dog1 = new Animal("Rex",2);
        dog1.favoriteFood = "Pedigri";
        dog1.favoriteRecreationActivity = "Running";
        dog1.healthLevel = 9;
        dog1.hungryLevel = 1;
        dog1.spiritLevel = 7;

        Food dogFood1 = new Food("Pedigiri");
        dogFood1.amount = 500;
        dogFood1.availability = true;
        dogFood1.price = 25.50;
        dogFood1.expirationDate = 25;

        RecreationActivity running = new RecreationActivity("running");


        Adopter adopter1 = new Adopter("David");
        adopter1.availableMoney = 500;

        Vet dogvet = new Vet("Dr.Phil");



    }


}
