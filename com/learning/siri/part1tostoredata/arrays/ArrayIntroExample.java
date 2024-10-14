package com.learning.siri.part1tostoredata.arrays;

public class ArrayIntroExample {
    public static void main(String[] args) {

        int[] studentMarks = new int[5];

        studentMarks[0] = 99;
        studentMarks[1] = 98;
        studentMarks[2] = 99;
        studentMarks[3] = 96;
        studentMarks[4] = 92;

        System.out.println(studentMarks[3]);

        for (int i = 0; i < 5; i++) {
            System.out.println(studentMarks[i]);
        }

        int[] studentAnothertMarks = {99, 98, 99, 96, 92};
        for (int i = 0; i < studentAnothertMarks.length; i++) {
            System.out.println(studentAnothertMarks[i]);
        }
        int[] intAr = new int[4];
        long[] longAr = new long[4];
        char[] charAr = new char[4];
        boolean[] booleanAr = new boolean[4];

        String[] strAr = new String[6];
        char[] anotherCharAr = new char[4];
        anotherCharAr[0] = 'a';
        anotherCharAr[1] = 'b';
        anotherCharAr[2] = 'c';
        anotherCharAr[3] = '7';

        for (int i = 0; i < anotherCharAr.length; i++) {
            System.out.println(anotherCharAr[i]);
        }
        String[] anotherStrAr = new String[5];
        anotherStrAr[0] = "sachin";
        anotherStrAr[1] = "sehwag";
        anotherStrAr[2] = "yuvraj";
        anotherStrAr[3] = "Dhoni";
        anotherStrAr[4] = "Kohli";

        for (int i = 0; i < anotherStrAr.length; i++) {
            System.out.println(anotherStrAr[i]);
        }
    }

}
