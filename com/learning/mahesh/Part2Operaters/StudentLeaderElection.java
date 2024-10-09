package com.learning.mahesh.Part2Operaters;

public class StudentLeaderElection {

     public static void main(String[] args) {
         String[] students = {"Sagar", "Sanjeev", "Suresh", "Ramesh"};
         double[] percentages = {70.0, 78.0, 89.0, 90.0};

         String leader = students[0];
         double highestPercentage = percentages[0];

         for (int i = 1; i < students.length; i++) {
             if (percentages[i] > highestPercentage) {
                 highestPercentage = percentages[i];
                 leader = students[i];
             }
         }
         {

            System.out.println("The student leader is: " + leader);
            System.out.println(leader + " secured " + highestPercentage + "% marks.");
        }
    }
}
