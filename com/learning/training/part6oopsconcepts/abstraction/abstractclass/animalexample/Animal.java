package com.learning.training.part6oopsconcepts.abstraction.abstractclass.animalexample;

//class is declared as abstract since it has one or more abstract methods
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
