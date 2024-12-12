package com.learning.training.part1tostoredata.wrapperclasses;

public class CharacterWrapperClass {
    public static void main(String[] args) {

        char primitiveCharVar = 'k';  //primitive variable
        Character wrapperCharObj = 'k'; //wrapper object

        //Utility methods
        wrapperCharObj.toString();  //converts 'k' to "k"

        //equals() method compares the value with another value
        // returns true if values match
        //returns false if values mismatch
        System.out.println(wrapperCharObj.equals('k'));  //returns true
        System.out.println(wrapperCharObj.equals('a')); //returns false
        System.out.println(wrapperCharObj.equals('K')); //returns false (case mismatch)

        //compareTo() method compares the value with another value
        //returns zero if both matches
        //returns positive integer if left value is greater than right value
        //returns negative integer if right value is greater than left value
        System.out.println(wrapperCharObj.compareTo('k'));
        System.out.println(wrapperCharObj.compareTo('i'));
        System.out.println(wrapperCharObj.compareTo('n'));
    }
}
