package com.learning.siri.part6oopsconcepts.abstractclass.animalexample;

public abstract class Herbivore extends Animal {

    @Override
    public void eatFood() {
        System.out.println("Eats grass");
    }
}