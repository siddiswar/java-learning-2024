package com.learning.mahesh.mypracticefolder.arrays;

public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Sum of elements: " + sum);
    }
}
