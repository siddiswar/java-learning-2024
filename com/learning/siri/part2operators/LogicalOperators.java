package com.learning.siri.part2operators;

public class LogicalOperators {

    public static void main(String[] args) {

        int age = 76;
        char gender = 'F';

        // Scheme 1: Only applicable for old females
        if (age > 60 && gender == 'F') {
            System.out.println("I am scheme 1: applicable for only old females");
        }

        // Scheme 2: Only applicable for all females and old males
        if (gender == 'F' || age > 60) {
            System.out.println("I am scheme 2: applicable for all females and old males");
        }

        // Scheme 3: For all females
        if (gender == 'F') {
            System.out.println("I am scheme 3: applicable only for all females");
        }

        if (!(gender == 'M')) {
            System.out.println("I am scheme 3:applicable only for all females");
        }
    }
}