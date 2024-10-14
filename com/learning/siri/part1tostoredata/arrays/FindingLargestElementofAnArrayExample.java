package com.learning.siri.part1tostoredata.arrays;

public class FindingLargestElementofAnArrayExample {
    public static void main(String[] args) {

        int[] studentMarks = new int[5];

        studentMarks[0] = 85;
        studentMarks[1] = 90;
        studentMarks[2] =100;
        studentMarks[3] =95;
        studentMarks[4] =99;

        int largestElement = 0;

        for ( int i= 0; i< studentMarks.length;i++){
            if (studentMarks[i] > largestElement){
                largestElement = studentMarks[i];
            }
        }
        System.out.println(largestElement);

        int anotherLargestElement = 0;
        for ( int eachMark : studentMarks ) {
            if (eachMark > anotherLargestElement){
                anotherLargestElement =eachMark;
            }
        }
        System.out.println(anotherLargestElement);

    }
}
