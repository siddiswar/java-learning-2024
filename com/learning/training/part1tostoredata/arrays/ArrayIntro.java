package com.learning.training.part1tostoredata.arrays;

public class ArrayIntro {

    public static void main(String[] args) {


        //primitive variables, Strings are used to store single value
        //If we want to store multiple values of same data type , we use Arrays


        //Step 1: Array Declaration. Remember the square brackets []
        // we need to declare the data type of Array and also hould declare the size of the Array
        int[] studentMarks = new int[5];

        // Elements in the array can be accessed using the index. Index starts from 0
        //Step 2: Assigning Values to Array

        studentMarks[0] = 99;
        studentMarks[1] = 98;
        studentMarks[2] = 99;
        studentMarks[3] = 95;
        studentMarks[4] = 92;

        // Accessing a value of an Array. Fir example 3rd element
        System.out.println(studentMarks[2]);

        // Accessing values fo Array using for loop

        for (int i = 0; i < 5; i++) {
            System.out.println(studentMarks[i]);
        }

        //To declare and initialize array in a single line (Also called as using Array constants)

        int[] studentAnotherMarks = {92, 85, 99, 96, 89};
        for (int i = 0; i < studentAnotherMarks.length; i++) {
            System.out.println(studentAnotherMarks[i]);
        }

        // We can declare arrays of different primitive data types
        int[] intAr = new int[4];
        long[] longAr = new long[4];
        char[] charAr = new char[4];
        boolean[] boolAr = new boolean[4];

        //We can also declare Array of Strings

        String[] strAr = new String[5];

        //char Array example
        char[] anotherCharAr = new char[4];
        anotherCharAr[0] = 'a';
        anotherCharAr[1] = '&';
        anotherCharAr[2] = '£';
        anotherCharAr[3] = '$';

        for (int i = 0; i < anotherCharAr.length; i++) {
            System.out.println(anotherCharAr[i]);
        }

        // String Array example
        String[] anotherStrAr = new String[5];
        anotherStrAr[0] = "Sachin";
        anotherStrAr[1] = "Sehwag";
        anotherStrAr[2] = "Yuvraj";
        anotherStrAr[3] = "Dhoni";
        anotherStrAr[4] = "Kohli";

        for (int i = 0; i < anotherStrAr.length; i++) {
            System.out.println(anotherStrAr[i]);
        }
    }
}
