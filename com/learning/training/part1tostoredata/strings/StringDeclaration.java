package com.learning.training.part1tostoredata.strings;

public class StringDeclaration {

    // primitive data types -> char-> char can hold single character and we use single quotes
    // String is an Object which is used to store a sequence of one or more characters. double quotes are used

    public static void main(String[] args) {

        String firstName = "Sachin";
        String lastName = "Tendulkar";
        String str1 = "a";
        String emptySpace = " ";
        String str2 = "1223asdasd132!@";


        System.out.println("Length : " + firstName.length());
        System.out.println(" to Upper case :" + firstName.toUpperCase());
        System.out.println(" to Lower case :" + firstName.toLowerCase());

        //To access a particular character in the string
        //using charAt(index) method
        //Index starts from 0 -> lengthOfTheArray-1

        char charVariable = firstName.charAt(0);
        System.out.println(charVariable);

        System.out.println(firstName.charAt(3));
        System.out.println(firstName.charAt(5));

        System.out.println("----------------------");
        //To print all characters of String
        for (int i = 0; i < firstName.length();i++){
            System.out.println(firstName.charAt(i));
        }

    }


}