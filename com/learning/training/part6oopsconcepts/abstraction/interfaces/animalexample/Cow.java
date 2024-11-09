package com.learning.training.part6oopsconcepts.abstraction.interfaces.animalexample;

public class Cow implements IAnimal{

    @Override
    public void eatFood() {
        System.out.println("Cow eats grass");

    }

    @Override
    public void sound() {
        System.out.println("Cow mows");
    }
}
