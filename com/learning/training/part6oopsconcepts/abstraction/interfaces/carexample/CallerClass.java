package com.learning.training.part6oopsconcepts.abstraction.interfaces.carexample;

public class CallerClass {

    public static void main(String[] args) {

        TataAutomaticCar tataAutomaticCar = new TataAutomaticCar();
        tataAutomaticCar.startEngine();
        tataAutomaticCar.stopEngine();
        tataAutomaticCar.applyBrakes();
        tataAutomaticCar.transmission();
        tataAutomaticCar.turnOnHeadLamps();
        tataAutomaticCar.turnOffHeadLamps();
        tataAutomaticCar.soundHorn();

        //we can't create objects for intefaces
//        ICar car = new ICar();
//
        //we can't create objects for abstract classes
//        TataCar tataCar = new TataCar();
    }
}
