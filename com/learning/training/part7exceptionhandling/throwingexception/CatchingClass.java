package com.learning.training.part7exceptionhandling.throwingexception;

public class CatchingClass {

    public static void main(String[] args) {

        ThrowingClass obj = new ThrowingClass();

        System.out.println("---------------Before------------------");
        obj.divideWithExceptionHandledAtSource(10, 0);
        System.out.println("---------------After------------------");


        System.out.println("---------------Before------------------");
        try {
            obj.divideWithExceptionThrownToCaller(10, 0);
        } catch (Exception e) {
            System.out.println("Exception handled in calling class");
        }
        System.out.println("---------------After------------------");
    }
}
