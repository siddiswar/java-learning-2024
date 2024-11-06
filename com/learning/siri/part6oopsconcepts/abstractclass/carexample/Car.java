package com.learning.siri.part6oopsconcepts.abstractclass.carexample;

public abstract class Car {

    public void startTheCar(){
        System.out.println("Car started");
    }

    public void stopCar(){
        System.out.println("Car sopped by applying brakes");
    }

    public void turnHeadLamp(){
        System.out.println("Lights turned on");
    }

    public abstract void gearTransmission();

}
