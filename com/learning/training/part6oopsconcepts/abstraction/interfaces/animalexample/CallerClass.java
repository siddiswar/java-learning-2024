package com.learning.training.part6oopsconcepts.abstraction.interfaces.animalexample;

public class CallerClass {
    public static void main(String[] args) {
        Lion lion = new Lion();
//        IAnimal lion = new Lion();  This is also allowed
        lion.eatFood();
        lion.sound();

        Cow cow = new Cow();
//        IAnimal cow = new Cow();  This is also allowed
        cow.eatFood();
        cow.sound();
    }
}
