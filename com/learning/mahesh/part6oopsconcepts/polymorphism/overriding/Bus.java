package com.learning.mahesh.part6oopsconcepts.polymorphism.overriding;

class Bus extends Vehicle {


    public void start() {
        System.out.println("Bus is starting on the road");
    }

    public void stop() {
        System.out.println("Bus is stopping at the bus stop");
    }
}
