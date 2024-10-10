package com.learning.mahesh.part3conditionalstatements;

public class WhileLoopForVoters {
    public static void main(String[] args) {
        int ageA = 20;
        int ageB = 23;
        int ageC = 21;
        int ageD = 16;
        int agelimit = 18;

        int[] ages ={ageA, ageB, ageC, ageD };
        int i = 0;

        while (i < ages.length) {
            if (ages[i] >= agelimit) {
                System.out.println("Person with age " + ages[i] + " is eligible to vote.");
            } else {
                System.out.println("Person with age " + ages[i] + " is not eligible to vote.");
            }
             i++;
    }}
}








