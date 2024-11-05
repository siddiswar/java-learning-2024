package com.learning.siri.part6oopsconcepts.polymorphism.overloading;

public class Calculator {
    public int Sum(int a, int b) {
        System.out.println("Inside Calculator");
        return a + b;
    }

    public int Sum(int a, int b, int c) {
        System.out.println("Inside Calculator");
        return a + b + c;

    }

    public int Sum (int a, int b, int c, int d) {
        System.out.println("Inside Calculator");
        return a + b + c + d;
    }

    public void concatenate(String a, String b) {
        String str = a + b;
        System.out.println("Inside Calculator :" + str);
    }

    public void concatenate(String a,int b) {
        String str = a + b;
        System.out.println("Inside Calculator :" + str);
    }
}
