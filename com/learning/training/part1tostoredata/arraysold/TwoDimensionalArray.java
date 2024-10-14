package com.learning.training.part1tostoredata.arraysold;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        int[] oneDimAr = new int[3];
        int[][] twoDimAr = new int[3][3];

        twoDimAr[0][0] = 45;
        twoDimAr[0][1] = 57;
        twoDimAr[0][2] = 43;

        twoDimAr[1][0] = -23;
        twoDimAr[1][1] = 34;
        twoDimAr[1][2] = -32;

        twoDimAr[2][0] = 10;
        twoDimAr[2][1] = 20;
        twoDimAr[2][2] = 30;

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                System.out.println(twoDimAr[x][y]);
            }

        }
    }


}
