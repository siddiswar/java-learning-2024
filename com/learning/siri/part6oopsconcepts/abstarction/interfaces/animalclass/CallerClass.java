package com.learning.siri.part6oopsconcepts.abstarction.interfaces.animalclass;

public class CallerClass {
    public static void main(String[]args) {
        Lion lion =new Lion();
        lion.eatFood();
        lion.sound();

        Cow cow = new Cow();
        cow.eatFood();
        cow.sound();
    }
}