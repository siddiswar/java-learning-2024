package com.learning.siri.part6oopsconcepts.abstractclass.animalexample;

public abstract class Carnivore extends Animal {
    @Override
    public void eatFood() {
        System.out.println("Eats only meat");
    }
}
