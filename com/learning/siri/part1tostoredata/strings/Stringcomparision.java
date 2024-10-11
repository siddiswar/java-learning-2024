package com.learning.siri.part1tostoredata.strings;

public class Stringcomparision {
    public static void main(String[] args) {
        String firstname = "Sriniavasa";

        //String comparison not ignoring the case
        if (firstname .equals("srinivasa")){
            System.out.println("strings matching");
        } else {
            System.out.println("strings not matching");
        }

        // string comparison by ignoring the case
        if (firstname.equalsIgnoreCase("srinivasa")){
            System.out.println("strings matching");
        }else {
            System.out.println("strings not matching");
        }
    }
}
