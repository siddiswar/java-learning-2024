package com.learning.training.part1tostoredata.wrapperclasses;

public class DoubleWrapperClass {
    public static void main(String[] args) {
        double doublePrimitiveVar = 123.45; //primitive variable
        Double doubleWrapperObj = 123.45; //wrapper object

        //utility methods
        System.out.println("Double value converted to Integer value : " + doubleWrapperObj.intValue());

        //Parsing a string to double value
        String someDoubleValueStr = "134.76";
        double parsedValue = Double.parseDouble(someDoubleValueStr);
        System.out.println("String value parsed to double : " + parsedValue);

        //equals() method compares the value with another value
        // returns true if values match
        //returns false if values mismatch
        System.out.println(doubleWrapperObj.equals(123.45));  //returns true
        System.out.println(doubleWrapperObj.equals(157.43)); //returns false


        //compareTo() method compares the value with another value
        //returns zero if both matches
        //returns 1 if left value is greater than right value
        //returns 11 if right value is greater than left value
        System.out.println(doubleWrapperObj.compareTo(123.45));  //returns 0
        System.out.println(doubleWrapperObj.compareTo(113.45));  //returns 1
        System.out.println(doubleWrapperObj.compareTo(133.45));  //returns -1

    }
}
