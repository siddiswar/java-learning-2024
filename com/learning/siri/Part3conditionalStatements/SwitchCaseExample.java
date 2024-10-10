package com.learning.siri.Part3conditionalStatements;

public class SwitchCaseExample {
    public static void main(String[] args) {

        // A,B,C,D,E

        char grade = 'E';
        int discountonFee = 0;
        int coursefee = 100000;

        switch (grade) {
            case 'A':
                discountonFee = 50000;
                break;

            case 'B':
                discountonFee = 40000;
                break;

            case'C':
                discountonFee = 30000;
                break;

            case 'D':
                discountonFee = 20000;
                break;

            default:
                discountonFee = 5000;

        }

        int finalFee = coursefee - discountonFee;
        System.out.println("Final Fee is " + finalFee);

    }
}
