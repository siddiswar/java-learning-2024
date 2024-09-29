package com.learning.training.part1tostoredata.arrays;

public class ArraysExample {
    public static void main(String[] args) {

        int[] myIntArray1 = {100, 90};

        System.out.println("0 index: " + myIntArray1[0]);
        System.out.println("1st index: " + myIntArray1[1]);

        String[] myStringArray1 = {"bmw", "audi", "honda"};
        System.out.println("0 index: " + myStringArray1[0]);
        System.out.println("1st index: " + myStringArray1[1]);
        System.out.println("2nd index: " + myStringArray1[2]);

        int len1 = myIntArray1.length;
        int len2 = myStringArray1.length;

        System.out.println("Int array length: " + len1);
        System.out.println("String array length: " + len2);

        for (int i = 0; i < len1; i++) {
            System.out.println(myIntArray1[i]);
        }

        java.util.Arrays.sort(myIntArray1);  // This now refers to java.util.Arrays

        for (int i = 0; i < len1; i++) {
            System.out.println(myIntArray1[i]);
        }
    }
}
