package com.learning.siri.part1tostoredata.strings;

public class StringConcatenationExample {
    public static void main(String[] args) {

        String firstName = "Srinivasa";
        String lastName = "Murthy";
        String emptySpace = " ";


        //String concatenation using *

        String fullName = firstName + emptySpace + lastName;
        String str3 = "Concatenated String is :" + fullName;
        System.out.println(str3);
        System.out.println("Concatenated String is :" + fullName);

        // string concatenation of a string with a numeric value

        int a =5;
        String str4 = "I am some string" + a; //"I am some string" + "5"
        System.out.println(str4);

        //String concatenation using concat() method
        String fullName2 = firstName.concat(lastName);
        System.out.println(fullName2);
        String fullName3 = firstName.concat(" ").concat(lastName);
        System.out.println();
    }

}


