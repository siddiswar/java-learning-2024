package com.learning.mahesh.part6oopsconcepts.polymorphism.overriding;

class Train extends Vehicle {


    public void start() {
        System.out.println("Train is starting on tracks");
    }

    public void stop() {
        System.out.println("Train is stopping at the station");
    }
}
