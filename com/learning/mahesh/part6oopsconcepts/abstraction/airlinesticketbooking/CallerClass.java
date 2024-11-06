package com.learning.mahesh.part6oopsconcepts.abstraction.airlinesticketbooking;

public class CallerClass {

    public static void main(String[] args) {
        Qatar Qatar;
        Qatar = new Qatar(30, 'M', "Armed Forces", "Economy", 300.0) {
            @Override
            public double calculateDiscount() {
                return super.calculateDiscount();
            }
        };
    }
}
