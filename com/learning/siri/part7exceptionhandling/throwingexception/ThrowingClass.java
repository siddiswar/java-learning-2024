package com.learning.siri.part7exceptionhandling.throwingexception;

public class ThrowingClass {
    public int divideWithExceptionHandleAtSource(int l,int m){
        int value;
        try{

            value = l/m;
        } catch (Exception e) {
            System.out.println("Exception handled in the class where it occurred");
            value = 0;

        }
        return value;
    }

    public int divideWithExceptionThrownToCaller(int l ,int m) throws Exception{
        return l/m;
    }
}
