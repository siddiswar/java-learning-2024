package com.learning.training.part6oopsconcepts.abstraction.abstractclass.carexample;

public class ManualCar extends Car {

    @Override
    public void gearTransmission() {
        System.out.println("Manual 6 gear transmission");
    }

    public void manualGearBoxOperation(){
        System.out.println("manual gear box operation");
    }

}
