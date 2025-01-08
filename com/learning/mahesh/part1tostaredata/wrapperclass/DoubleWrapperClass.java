package com.learning.mahesh.part1tostaredata.wrapperclass;


public class DoubleWrapperClass {
    public static void main(String[] args) {
        double doublePrimitiveVar = 123.45;
        Double doubleWrapperObj = 123.45;

        System.out.println("Double value converted to Integer value : " + doubleWrapperObj.intValue());

        String someDoubleValueStr = "134.76";
        double parsedValue = Double.parseDouble(someDoubleValueStr);
        System.out.println("String value parsed to double : " + parsedValue);

        System.out.println(doubleWrapperObj.equals(123.45));
        System.out.println(doubleWrapperObj.equals(157.43));


        System.out.println(doubleWrapperObj.compareTo(123.45));
        System.out.println(doubleWrapperObj.compareTo(113.45));
        System.out.println(doubleWrapperObj.compareTo(133.45));
    }
}

