package com.learning.training.part6oopsconcepts.polymorphism.overriding;

public class Dog extends Animal {

    public void makeNoise() {
        System.out.println("Dog can bark");
    }

    public void canShout1(){
        //Since there is a makeNoise() method present in both parent and child classes,
        // because of Overriding, by default, the child class method takes precedence.
        //This will call the makeNoise() method present in child Dog class
        makeNoise();
    }

    public void canShout2(){
        //However, If we want to use parent class method instead of child class method,
        // we can call the method using super keyword as shown below
        //This will call the makeNoise() method present in parent Animal class
        super.makeNoise();
    }
}
