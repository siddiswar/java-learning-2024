package com.learning.training.part4loops;

public class WhileLoop {
    public static void main(String[] args) {

        int i = 10;

        /*While (i<10) {
            //System.out.println(i);
            i++;
            if(i ==17) {
               continue;
            }
            system.out.println("value of i " + i);

        }
        System.out.println("outside loop.....");*/

        do {
            //System.out.println("do while loop......");
            System.out.println(i);
            i++;

        } while (i<10);

    }

}
