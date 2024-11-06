package com.learning.siri.part6oopsconcepts.abstractclass.animalexample;

public abstract class Animal {

    //Concrete method
    public void drinkWater(){
        System.out.println("Drinking water");
    }

    //Concrete method
    public void sleep(){
        System.out.println("Sleeping");
    }

    //abstract method
    public abstract void eatFood();

    //abstract method
    public abstract void sound();
}

