package com.learning.siri.part1tostoredata.wrapperclass;

public class DoubleWrapperClass {
    public static void main(String[] args) {
        double doublePrimitiveVar = 123.45;
        Double doubleWrapperObj = 123.56;

        System.out.println("Double value converted to Integer value : " + doubleWrapperObj.intValue());

        String someDoubleValueStr = "123.45";
        double parsedValue = Double.parseDouble(someDoubleValueStr);
        System.out.println("String value parsed to double : " + parsedValue);


        System.out.println(doubleWrapperObj.equals(123.45));
        System.out.println(doubleWrapperObj.equals(145.34));

        System.out.println(doubleWrapperObj.compareTo(123.45));
        System.out.println(doubleWrapperObj.compareTo(113.56));
        System.out.println(doubleWrapperObj.compareTo(123.45));

    }
}
