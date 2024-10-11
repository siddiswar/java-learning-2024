package com.learning.siri.part1tostoredata.strings;

public class StringSplitExample {
    public static void main(String[] args) {
        String fullName = "Srinivasa Murthy Deevi";
        //String[] strAr = fullName.split(" "); //split by space " "
        //String[] strAr = fullname.split("a"); //split by character a "a"
        String[] strAr = fullName.split( "sa"); //Split by character "a"

        for(int i = 0; i<strAr.length;i++){
            System.out.println(strAr[i]);
        }
    }
}
