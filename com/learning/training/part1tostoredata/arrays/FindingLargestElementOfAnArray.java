package com.learning.training.part1tostoredata.arrays;

public class FindingLargestElementOfAnArray {
    public static void main(String[] args) {

        int[] studentMarks = new int[5];

        studentMarks[0] = 82;
        studentMarks[1] = 90;
        studentMarks[2] = 199;
        studentMarks[3] = 95;
        studentMarks[4] = 102;


        int largestElement = 0;

        for (int i = 0; i < studentMarks.length; i++) {
            if (studentMarks[i] > largestElement) {
                largestElement = studentMarks[i];
            }
        }
        System.out.println(largestElement);

        //Using for each loop

        int anotherLargestElement = 0;
        for (int eachMark : studentMarks) {
            if (eachMark > anotherLargestElement) {
                anotherLargestElement = eachMark;
            }
        }
        System.out.println(anotherLargestElement);

    }
}
