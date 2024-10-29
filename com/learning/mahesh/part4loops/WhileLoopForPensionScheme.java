package com.learning.mahesh.part4loops;

public class WhileLoopForPensionScheme {
    public static void main(String[] args) {

        int personA = 65;
        int personB = 62;
        int personC = 67;
        int personD = 68;
        int personE = 67;
        int personF = 64;
        int personG = 65;
        int personH = 72;
        int pensionagelimit = 65;

        int[] people = {65, 62, 67, 68, 67, 64, 65, 72};

        int i = 0;


        while (i < people.length) {
            if (people[i] >= pensionagelimit) {
                System.out.println("Person with age " + people[i] + " is eligible for pension.");
            } else {
                System.out.println("Person with age " + people[i] + " is not eligible for pension.");
            }
            i++;
        }
    }
}