package com.learning.training.part6oopsconcepts.polymorphism.overloading;

public class Calculator {
    //Variables

    //Methods

    //The following sum methods
    //same method name
    //Same return type
    //different parameters
    //Is considered as Overloading
    public int sum(int a, int b) {
        System.out.println("Inside Calculator");
        return a + b;
    }

    public int sum(int a, int b, int c) {
        System.out.println("Inside Calculator");
        return a + b + c;
    }

    public int sum(int a, int b, int c, int d) {
        System.out.println("Inside Calculator");
        return a + b + c + d;
    }


    // The following concatenate have
    // Same method name
    // same return type
    // different parameters
    // Is considered as overloading
    public void concatenate(String a, String b) {
        String str = a + b;
        System.out.println("Inside Calculator :" + str);
    }

    public void concatenate(String a, int b) {
        String str = a + b;
        System.out.println("Inside Calculator :" + str);
    }

    //The following methods have
    // Same method name
    // different return types
    // same parameters
    //This is not considered as overloading
//    public int multiply(int a, int b) {
//        return a * b;
//    }
//
//    public void multiply(int a, int b) {
//        System.out.println(a * b);
//    }

    //if a method with same return type, same name, different parameters (either the number of parameters is different or parameter types are different)

}
