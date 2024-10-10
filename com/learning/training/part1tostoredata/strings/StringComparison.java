package com.learning.training.part1tostoredata.strings;

public class StringComparison {

    public static void main(String[] args) {
        String firstName = "Sachin";

        //String comparison not ignoring the case
        if (firstName.equals("sachin")) {
            System.out.println("Strings matching");
        } else {
            System.out.println("Strings not matching");
        }

        //String comparison by ignoring the case
        if (firstName.equalsIgnoreCase("sachin")) {
            System.out.println("Strings matching");
        } else {
            System.out.println("Strings not matching");
        }

        //Remember for comparing two primitive variables, we use ==
        //Eg :  if (a==b)
        // But for comparing two Strings, we should not use ==
        // We should use equals() or equalsIgnoreCase() methods
    }
}