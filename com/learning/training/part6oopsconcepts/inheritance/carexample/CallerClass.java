package com.learning.training.part6oopsconcepts.inheritance.carexample;

public class CallerClass {
    public static void main(String[] args) {
        Car car = new Car();

        //MaruthiCar extends Car.
        // Car is called as Parent class
        // MaruthiCar is called as Child class or Sub class
        //maruthiCar object inherits all those variables and methods which are not private from parent class
        MaruthiCar maruthiCar = new MaruthiCar();

        //hyundaiCar object inherits all those variables and methods which are not private from parent class
        HyundaiCar hyundaiCar = new HyundaiCar();
    }
}
