package com.learning.mahesh.mypracticefolder.arrays;

public class StudentSubjectExample {
    public static void main(String[] args) {

        String[]  student = {"Dhruv", "Rati", "vaibhav"};


        String[] subjects = {"Math", "Science", "English"};


        int[][] marks = {
                {85, 90, 78},
                {88, 76, 95},
                {92, 88, 80}
        };


        for (int i = 0; i < student.length; i++) {
            System.out.println("Student: " + student[i]);
            for (int j = 0; j < subjects.length; j++) {
                System.out.println("  " + subjects[j] + ": " + marks[i][j]);
            }
            System.out.println();
        }
    }
}
