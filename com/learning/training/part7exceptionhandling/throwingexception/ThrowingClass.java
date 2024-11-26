package com.learning.training.part7exceptionhandling.throwingexception;

public class ThrowingClass {

    //Technique 1: Exception is handled using try-catch right at the place where it occurs
    public int divideWithExceptionHandledAtSource(int l, int m) {
        int value;
        try {
            value = l / m;
        } catch (Exception e) {
            System.out.println("Exception handled in the class where it occurred");
            value = 0;
        }
        return value;
    }

    //Technique 2: Exception is thrown to calling class using 'throws' keyword
    //Calling class has to handle the exception using try-catch block
    public int divideWithExceptionThrownToCaller(int l, int m) throws Exception {
        return l/m;
    }
}
