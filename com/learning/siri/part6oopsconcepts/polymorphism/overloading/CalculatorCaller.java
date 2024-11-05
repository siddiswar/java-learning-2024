package com.learning.siri.part6oopsconcepts.polymorphism.overloading;

public class CalculatorCaller {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.Sum(2,3);

        calculator.Sum(1,2,3);

        calculator.Sum(1,2,3,4);

        calculator.concatenate("siri","honey");

        calculator.concatenate("honey",9);
    }
}
