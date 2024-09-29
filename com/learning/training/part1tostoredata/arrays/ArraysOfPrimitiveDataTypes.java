package com.learning.training.part1tostoredata.arrays;

public class ArraysOfPrimitiveDataTypes {

    public static void main(String[] args) {


        // -----------------------Arrays of  number data types => byte, short, int, long ------------------------------------------------------------

        // technique 1
        //  Array declaration , on the left we should provide data type of array.
        //  and on the right we should use 'new' keyword and also the size of the array
        int[] studentScoresAr = new int[5];

        // Assigning Values to an Array
        studentScoresAr[0] = 99;
        studentScoresAr[1] = 98;
        studentScoresAr[2] = 100;
        studentScoresAr[3] = 88;
        studentScoresAr[4] = 92;

        // technique 2
        // Array declaration and inline assignment
        // Since we are assigning 5 values, size of the studentScoresAr2 would be 5
        int[] studentScoresAnotherAR = {90, 85, 84, 88, 99};

        // how to access values of an array?
        // the values in an array can be accessed using index.
        // index starts from 0.
        // in an array of size 5, the indices are 0,1,2,3,4
        // to access the second value in the array.
        System.out.println(studentScoresAr[1]);
        System.out.println(studentScoresAnotherAR[1]);


        // To access all the values present in an array
        // We can access each element in an array by running a for loop from 0 to size-1
        int arrayLength = studentScoresAr.length;
        System.out.println("Array length is : " + arrayLength);

        for (int i = 0; i < 5; i = i++) {
            System.out.println("Implement your logic here");
            System.out.println(studentScoresAr[i]);
        }

        // -----------------------Arrays of  decimal data types => float, double ------------------------------------------------------------

        // -----------------------Arrays of  char data types => char ------------------------------------------------------------

        // -----------------------Arrays of  boolean data types => boolean ------------------------------------------------------------
        boolean[] booleanStudentsPassedArray = new boolean[5];
        booleanStudentsPassedArray[0] = true;
        booleanStudentsPassedArray[1] = false;
        booleanStudentsPassedArray[2] = true;
        booleanStudentsPassedArray[3] = true;
        booleanStudentsPassedArray[4] = false;

        for (int i = 0; i < booleanStudentsPassedArray.length; i = i++) {
            System.out.println("Implement your logic here");
            System.out.println(booleanStudentsPassedArray[i]);
        }
    }
}
