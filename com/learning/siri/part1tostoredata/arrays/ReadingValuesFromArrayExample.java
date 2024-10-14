package com.learning.siri.part1tostoredata.arrays;

public class ReadingValuesFromArrayExample {
    public static void main(String[] args) {

        String[] cricketPlayers = new String[6];
        cricketPlayers [0] = "Sachin";
        cricketPlayers [1] = "Ganguly";
        cricketPlayers [2] = "Sehwag";
        cricketPlayers [3] = "Dhoni";
        cricketPlayers [4] = "Kohli";

        for (int i = 0; i < cricketPlayers.length;i++){
            System.out.println(cricketPlayers[i]);
        }
        System.out.println("----------------------------------------------------");

        for(String eachPlayer : cricketPlayers){
            System.out.println(eachPlayer);
        }

        System.out.println("---------------------------------------------------------");

        int[] studenMarks = {92,98,95,96,89};

        for( int eachMark:studenMarks){
            System.out.println(eachMark);
        }
    }
}
