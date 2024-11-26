package com.learning.mahesh.mypracticefolder.arrays;

public class ArrayMax {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 5, 40, 25};

        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Maximum value: " + max);
    }
}
