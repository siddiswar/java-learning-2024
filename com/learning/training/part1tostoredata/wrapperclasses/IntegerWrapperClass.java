package com.learning.training.part1tostoredata.wrapperclasses;

public class IntegerWrapperClass {
    public static void main(String[] args) {

        int primitiveVar = 10; // primitive variable
        Integer intWrapperObj = 12; //wrapper object

        System.out.println("primitive variable value " + primitiveVar);
        System.out.println("wrapper variable value " + intWrapperObj);

        //Utility methods
        //to convert to string
        System.out.println(intWrapperObj.toString()); //12 becomes "12"

        //to convert to float
        System.out.println("Float value is : " + intWrapperObj.floatValue());

        //to convert to double
        System.out.println("double value is : " + intWrapperObj.doubleValue());

        //String parsed to Integer
        String s1 = "123";
        Integer a = Integer.parseInt(s1);
        System.out.println("String parsed to Integer : " + a);


        //equals() method compares the value with another value
        // returns true if values match
        //returns false if values mismatch
        System.out.println(intWrapperObj.equals(12));  //returns true
        System.out.println(intWrapperObj.equals(15)); //returns false


        //compareTo() method compares the value with another value
        //returns zero if both matches
        //returns 1 if left value is greater than right value
        //returns 11 if right value is greater than left value
        System.out.println(intWrapperObj.compareTo(12));  //returns 0
        System.out.println(intWrapperObj.compareTo(11));  //returns 1
        System.out.println(intWrapperObj.compareTo(13));  //returns -1
    }
}
