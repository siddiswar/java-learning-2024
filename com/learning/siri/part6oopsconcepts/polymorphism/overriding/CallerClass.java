package com.learning.siri.part6oopsconcepts.polymorphism.overriding;

import com.learning.training.part6oopsconcepts.polymorphism.overriding.Dog;

public class CallerClass {

    public static void main(String [] args) {
        Dog dog = new Dog();
        dog.makeNoise();
    }
}
