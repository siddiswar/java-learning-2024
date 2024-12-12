package com.learning.siri.part7exceptionhandling.throwingexception;

import com.learning.training.part7exceptionhandling.throwingexception.ThrowingClass;

public class CatchingClass {

    public static void main(String[] args){

        ThrowingClass obj =new ThrowingClass();

        System.out.println("........................Before.....................");
        obj.divideWithExceptionHandledAtSource(20,10);
        System.out.println("..........After.................");

        System.out.println("............Before..................");
        try{
            obj.divideWithExceptionThrownToCaller(20,10);
        } catch (Exception e) {
            System.out.println("Exception handled in calling class");
        }

        System.out.println(".............After.............");
    }
}
