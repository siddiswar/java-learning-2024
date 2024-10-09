package com.learning.siri.Part4Loops;

public class ForLoopExample {
    public static void main( String [] args) {

        // print all the numbers from 0 to 10

        // loop control variable, int i
        // loop control condition, i<=10
        //i++ => i = i+1
        for (int i = 0; i <= 10; i++){
            System.out.println(i);

        }

        System.out.println("-----------------------------------");
        // print all the numbers from 5 to 10
        for ( int i = 5; i <=10; i++) {
            System.out.println(i);

        }

        System.out.println("------------------------------------");
        //print all the numbers from 10 to 0
        for ( int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

    }
}
