package com.learning.training.part6oopsconcepts.polymorphism.overloading;

public class CalculatorCaller {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        //This one calls the sum method which takes two int, int parameters
        calculator.sum(2,3);

        //This one calls the sum method which takes three int, int, int parameters
        calculator.sum(1,2,3);

        //This one calls the sum method which takes four int, int, int, int parameters
        calculator.sum(1,2,3,4);

        //This one calls the concatenate method which takes String, String parameters
        calculator.concatenate("siddu","reddy");

        //This one calls the concatenate method which takes String, int parameters
        calculator.concatenate("siddu",5);
    }
}
