package com.learning.training.part4loops;

public class LoopsWithBreakContinueExample {

    public static void mainI(String[] args) {
        // print only even numbers between 1-20
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("----------------------------");
        // print only even numbers between 1-20
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 1) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("--------------------------------");
        //break out of the loop when i>12
        //print only even numbers between 1-20
        for (int i = 1; i <= 20; i++) {
            if (i > 12) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("-------------------------");
        // break out of the loop when i>12
        //print only even numbers between 1-20
        for (int i = 1; i <= 20; i++) {
            if (i > 12) {
                break;
            }
            System.out.println(i);
        }

        // List even odd numbers between 1 and 20

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even : " + i);
            } else {
                System.out.println("Odd : " + i);
            }
        }
    }
}
