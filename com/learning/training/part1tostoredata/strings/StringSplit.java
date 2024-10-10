package com.learning.training.part1tostoredata.strings;

public class StringSplit {
    public static void main(String[] args) {
        String fullName = "Sachin Ramesh Tendulkar";
        //String[] strAr = fullName.split(" ");  //Split by space " "
        //String[] strAr = fullName.split("a");  //Split by character a "a"
        String[] strAr = fullName.split("Ra");  //Split by character a "a"


        for(int i=0;i<strAr.length;i++){
            System.out.println(strAr[i]);
        }
    }
}