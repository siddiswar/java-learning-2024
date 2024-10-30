package com.learning.training.part6oopsconcepts.inheritance.carexample;

public class Car {

    // Member variables
    public String brand;
    public String model;
    public String engineModel;
    public String fuelType;
    public int fuelTankCapacity;
    public double mileage;

    //Constructor

    //Member Methods
    public void startTheCar(){
        System.out.println("Started");
    }

    public void accelerate(){
        System.out.println("accelerating");

    }

    public void applyBrake(){
        System.out.println("Applied Disc brakes ");
    }

    public void stop(){
        System.out.println("Stopped");
    }

}
