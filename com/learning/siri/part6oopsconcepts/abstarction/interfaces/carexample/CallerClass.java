package com.learning.siri.part6oopsconcepts.abstarction.interfaces.carexample;



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

    }
}