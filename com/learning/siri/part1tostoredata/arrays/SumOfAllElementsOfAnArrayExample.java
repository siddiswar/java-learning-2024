package com.learning.siri.part1tostoredata.arrays;

public class SumOfAllElementsOfAnArrayExample {
    public static void main(String[] args) {

        int[] studentMarks = new int[5];

        studentMarks [0] = 99;
        studentMarks [1] = 98;
        studentMarks [2] = 97;
        studentMarks [3] = 96;
        studentMarks [4] = 95;

        int totalMarks = 0;

        for (int i = 0;i<studentMarks.length;i++){
            totalMarks =totalMarks + studentMarks[i];

        }
        System.out.println(totalMarks);

        int anotherTotalMarks = 0;
        for (int eachMark: studentMarks){
            anotherTotalMarks = anotherTotalMarks + eachMark;

        }
        System.out.println(anotherTotalMarks);
    }
}
