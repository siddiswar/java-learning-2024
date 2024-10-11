package com.learning.training.part1tostoredata.arraysold;

public class StringArrayExample {

    public static void main(String[] args) {
        //We will cover string in a separate section
        // creating an array
        String[] strAr1 = new String[4];
        strAr1[0] = "sachin";
        strAr1[1] = "ramesh";
        strAr1[2] = "tendulkar";

        String[] strAr2 = {"sachin","sehwag","yuvraj"};

                //to access a particular position in an array
        System.out.println(strAr1[2]);

        // to access all values in the array
        for (int i=0;i<strAr1.length;i++){
            System.out.println(strAr1[i]);
        }
    }


}
