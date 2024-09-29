package com.learning.training.part2operators;

public class LogicalOperators {

    public static void main(String[] args) {

        int age = 62;
        char gender = 'F';


        //Scheme 1: only applicable for old females
        if (age > 60 && gender == 'F') {
            System.out.println("I am sceheme 1: applicable for only old females ");
        }


        //Scheme 2: only applicable for all females and old males
        if (gender == 'F' || age > 60) {
            System.out.println("I am sceheme 2: applicable for all females and old males ");
        }

        //Scheme 3 : for all females
        if (gender == 'F') {
            System.out.println("I am sceheme 3: applicable only for all females ");
        }

        if (!(gender == 'M')) {
            System.out.println("I am sceheme 3: applicable only for all females ");
        }

    }
}
