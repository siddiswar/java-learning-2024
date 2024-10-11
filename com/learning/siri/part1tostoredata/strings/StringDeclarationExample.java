package com.learning.siri.part1tostoredata.strings;

public class StringDeclarationExample {

    // primitive date types-> car->char can hold single character and we use single quotes
    // string is an object which is used to store a sequence of one or more characters,double quotes are used

    public static void main(String[] args) {

        String firstName = "srinivasa";
        String lastName = "Murthy";
        String str1 = "a";
        String emptySpace = " ";
        String str2 = " dtdtfkfyfjiji";


        System.out.println("Length: " + firstName.length());
        System.out.println("to upper case:" + firstName.toUpperCase());
        System.out.println("to lower case :"+ firstName.toLowerCase());

        // To access a particular character in the string
        // Using charAt(index) method
        //Index starts from 0 -> lengthofTheArray-1

        char charVariable = firstName.charAt(0);
        System.out.println(charVariable);

        System.out.println(firstName.charAt(3));
        System.out.println(firstName.charAt(5));


        System.out.println(".................");
        //To print all characters of string
        for(int i = 0; i<firstName.length();i++){
            System.out.println(firstName.charAt(i));
        }
    }
}
