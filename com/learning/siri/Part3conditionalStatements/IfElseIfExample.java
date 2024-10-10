package com.learning.siri.Part3conditionalStatements;

public class IfElseIfExample {
    public static void main(String[] args) {

        // discount based on age
        // <18,20 percent discount
        // between 18 and 60,5 percent discount
        // > 60,50 percent discount


        int age = 65;
        int price = 120;

        int discount = 0;
        int discountedPrice = 0;

        if ( age < 18) {
            discount = price * 20/100;
        } else if (age >= 18 && age <60) {
            discount = price* 5 /100;
        }else {
            discount = price * 50/100;
        }
    }

}
