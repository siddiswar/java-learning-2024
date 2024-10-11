package com.learning.training.part1tostoredata.arrays;

public class ReadingValuesFromArray {
    public static void main(String[] args) {


        String[] cricketPlayers = new String[5];
        cricketPlayers[0] = "Sachin";
        cricketPlayers[1] = "Sehwag";
        cricketPlayers[2] = "Yuvraj";
        cricketPlayers[3] = "Dhoni";
        cricketPlayers[4] = "Kohli";

        //Reading using for loop
        for (int i = 0; i < cricketPlayers.length; i++) {
            System.out.println(cricketPlayers[i]);
        }
        System.out.println("-------------------------------------------------");
        //Reading using for each loop also called as advanced for loop
        for (String eachPlayer : cricketPlayers) {
            System.out.println(eachPlayer);
        }
        System.out.println("-------------------------------------------------");

        //Reading using for each loop from an int array
        int[] studentMarks = {92, 85, 99, 96, 89};

        for (int eachMark:studentMarks){
            System.out.println(eachMark);
        }


    }
}
