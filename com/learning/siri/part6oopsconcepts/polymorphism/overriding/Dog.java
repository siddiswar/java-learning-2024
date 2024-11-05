package com.learning.siri.part6oopsconcepts.polymorphism.overriding;

import com.learning.training.part6oopsconcepts.polymorphism.overriding.Animal;

public class Dog extends Animal {

    public void makeNoise(){
        System.out.println("Dog can bark");
    }

    public void canShout1(){
        makeNoise();
    }
    public void canShout2(){
        super.makeNoise();
    }
}
