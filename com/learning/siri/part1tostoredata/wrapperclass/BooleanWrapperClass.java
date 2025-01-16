package com.learning.siri.part1tostoredata.wrapperclass;

public class BooleanWrapperClass {
    public static void main(String [] args) {

        boolean primitiveBooleanVar = true;
        Boolean WrapperBooleanObj = false;

        WrapperBooleanObj.toString();

        System.out.println(WrapperBooleanObj.equals(false));

        System.out.println(WrapperBooleanObj.compareTo(true));
    }
}
