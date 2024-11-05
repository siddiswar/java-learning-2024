package com.learning.training.part6oopsconcepts.abstraction.abstractclass.animalexample;

//This class is not abstract
//since all the abstract methods got implemented by now
public class Cow extends Herbivore{
    @Override
    public void sound() {
        System.out.println("Cow Moos");
    }
}
