package com.learning.training.part6oopsconcepts.abstraction.abstractclass.carexample;

public abstract class Car {

    //Concrete methods are the methods which have method body
    public void startTheCar(){
        System.out.println("Car started");
    }

    public void stopCar(){
        System.out.println("Car sopped by applying brakes");
    }

    public void turnHeadLamp(){
        System.out.println("Lights turned on");
    }

    //abstract method is a method which has no method body
    public abstract void gearTransmission();


}
