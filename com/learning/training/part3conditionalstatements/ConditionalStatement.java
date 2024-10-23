package com.learning.training.part3conditionalstatements;

public class ConditionalStatement {
    public static void main(String[] args) {

        int Score = 96;
        String grade;


        if (Score > 90) {
            grade = "A";
        }
        else if (Score > 80) {
            grade = "B";
        }
        else {
              grade = "C";
        }
        System.out.println("Score is : " +  Score);
        System.out.println("Grade is : " + grade);
    }

}
