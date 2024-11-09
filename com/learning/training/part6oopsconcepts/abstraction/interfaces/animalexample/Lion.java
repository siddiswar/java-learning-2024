package com.learning.training.part6oopsconcepts.abstraction.interfaces.animalexample;

public class Lion implements IAnimal {
    @Override
    public void eatFood() {
        System.out.println("Lion eats meat");
    }

    @Override
    public void sound() {
        System.out.println("Lion roars");
    }
}
