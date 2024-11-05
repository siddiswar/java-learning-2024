package com.learning.training.part6oopsconcepts.abstraction.abstractclass.animalexample;

public class CallerClass {
    public static void main(String[] args) {

        //Cow is the concrete class,
        // so we can create object
        Cow cow = new Cow();
        cow.sound();
        cow.sleep();
        cow.drinkWater();
        cow.eatFood();

        Lion lion = new Lion();
        lion.sound();
        lion.sleep();
        lion.drinkWater();
        lion.eatFood();

        //Abstract calsses can't be instantiated. i.e. we can't create objects of abstract classes
        //Since abstarct classes have unimplemented abstract methods, we can't create objects
//        Herbivore herbivore = new Herbivore() ;
//        Carnivore carnivore = new Carnivore();
//        Animal animal = new Animal();

    }
}
