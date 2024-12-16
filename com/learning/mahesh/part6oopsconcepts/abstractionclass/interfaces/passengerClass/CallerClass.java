package com.learning.mahesh.part6oopsconcepts.abstractionclass.interfaces.passengerClass;

public class CallerClass {
    public static void main(String[] args) {
        Passenger adultPassenger = new AdultPassenger(1);
        Passenger childPassenger = new ChildPassenger(2);
        Passenger seniorPassenger = new SeniorPassenger(3);


    }
}