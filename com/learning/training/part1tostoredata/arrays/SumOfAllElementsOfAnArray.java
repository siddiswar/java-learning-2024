package com.learning.training.part1tostoredata.arrays;

public class SumOfAllElementsOfAnArray {

    public static void main(String[] args) {

        int[] studentMarks = new int[5];

        studentMarks[0] = 99;
        studentMarks[1] = 98;
        studentMarks[2] = 99;
        studentMarks[3] = 95;
        studentMarks[4] = 92;

//        int totalMarks = studentMarks[0] + studentMarks[1] + studentMarks[2] + studentMarks[3] + studentMarks[4];


        int totalMarks = 0;

        for (int i = 0; i < studentMarks.length; i++) {
            totalMarks = totalMarks + studentMarks[i];
        }

        System.out.println(totalMarks);

        //using for each loop

        int anotherTotalMarks = 0;
        for (int eachMark : studentMarks) {
            anotherTotalMarks = anotherTotalMarks + eachMark;
        }
        System.out.println(anotherTotalMarks);


    }
}
