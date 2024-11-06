package com.learning.siri.part6oopsconcepts.abstractclass.carexample;

public class ManualCar extends Car {

    @Override
    public void gearTransmission() {
        System.out.println("Manual 6 gear transmission");
    }

    public void manualGearBoxOperation(){
        System.out.println("manual gear box operation");
    }

}