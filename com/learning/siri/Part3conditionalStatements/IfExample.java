package com.learning.siri.Part3conditionalStatements;

public class IfExample {
    public static void main(String[] args){
        // if age greater than 70, then free ticket

        int Percentage = 50;
        int luggageprice = 10;
        int Age = 78;

        int ticketPrice  = 80;
        if (Age <= 70){
            ticketPrice = 0;
        }

        int totalPrice = ticketPrice + luggageprice;
        System.out.println("Total price for person :" + totalPrice);
    }
}
