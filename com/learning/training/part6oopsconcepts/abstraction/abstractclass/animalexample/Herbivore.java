package com.learning.training.part6oopsconcepts.abstraction.abstractclass.animalexample;

//This class is declared abstract
// since it has not implemented all abstract methods from Animal class
// abstract sound() method still doesn't have implementation yet
public abstract class Herbivore extends Animal {

    @Override
    public void eatFood() {
        System.out.println("Eats grass");
    }
}
