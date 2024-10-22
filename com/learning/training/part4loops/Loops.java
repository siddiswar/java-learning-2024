package com.learning.training.part4loops;

public class Loops {
    public static void main( String[] args) {

        System.out.println("Using while loop:");
        int i = 1;
        while (i <= 3) {
            System.out.println("i: " + i);
            i++;
        }

        System.out.println("Using do-while loop:");
        int j = 1;
        do{
            System.out.println("j:" + j);
            j++;
        } while (j <=3);

        System.out.println("Using for loop:");
        for (int k = 1; k<= 3; k++) {
        }
    }
}
