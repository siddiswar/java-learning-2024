package com.learning.mahesh.part3conditionalstatements;

public class IfElseLoopsPractice {
    public static void main(String[] args) {
        int studentA = 66;
        int studentB = 72;
        int studentC = 83;
        int studentD = 92;
        int studentE = 55;
        int studentF = 77;
        int studentG = 66;
        int studentH = 50;

        int[] studentsmarks = {66, 72, 83, 92, 55, 77, 66, 50};
        int i = 0;
        while (i < args.length) {
            int[] studentspercentage = {80, 70, 60, 50};
            int i1 = 80;
            int i2 = 70;
            int i3 = 60;
            int i4 = 50;

            while (i < studentsmarks.length) {
                if (studentsmarks[i] >= i1) {
                    System.out.println("student above 80 " + studentsmarks[i] + "this student is in sec A.");
                } else if (studentsmarks[i] >= i2) {
                    System.out.println("student above 70 " + studentsmarks[i] + "this student is in sec B.");
                } else if (studentsmarks[i] >= i3) {
                    System.out.println("student above 60 " + studentsmarks[i] + "this student is in sec C.");
                } else if (studentsmarks[i] >= i4) {
                    System.out.println("student above 80 " + studentsmarks[i] + "this student is in sec D.");
                }
                i++;
            }


            }
        }
    }