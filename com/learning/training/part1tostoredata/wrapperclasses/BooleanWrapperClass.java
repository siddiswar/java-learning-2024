package com.learning.training.part1tostoredata.wrapperclasses;

public class BooleanWrapperClass {
    public static void main(String[] args) {

        boolean primitiveBooleanVar = true; //primitive variable
        Boolean wrapperBooleanObj = false;//wrapper object

        //Utility methods
        wrapperBooleanObj.toString();  //true becomes "true"

        //equals() method
        //To compare the value of wrapper object with another boolean object
        //returns true or false
        System.out.println(wrapperBooleanObj.equals(false));

        //compareTo() method compares the boolean value with another boolean value
        //returns zero if both matches
        // returns 1 if true on the left and false on the right
        // returns -1 if false on the left and true on the right
        System.out.println(wrapperBooleanObj.compareTo(true));
    }
}
