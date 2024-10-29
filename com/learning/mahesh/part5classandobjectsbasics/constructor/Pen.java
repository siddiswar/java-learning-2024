package com.learning.mahesh.part5classandobjectsbasics.constructor;

public class Pen {

    private String color;
    private String type;
    private double tipSize;


    public Pen() {
        this.color = "Blue";
        this.type = "Ballpoint";
        this.tipSize = 0.7;
        System.out.println("Default constructor called: " + this.color + " " + this.type + " pen with tip size " + this.tipSize + "mm.");
    }

    public Pen(String color, String type, double tipSize) {
        this.color = color;
        this.type = type;
        this.tipSize = tipSize;
        System.out.println("Constructor with color, type, and tipSize called: " + this.color + " " + this.type + " pen with tip size " + this.tipSize + "mm.");
    }

    public void displayPenInfo() {
        System.out.println("Pen Details: " + color + " " + type + " pen, Tip size: " + tipSize + "mm");
    }
    public static void main(String[] args) {

        Pen pen4 = new Pen("Green", "Fountain", 1.0);
        pen4.displayPenInfo();
    }
}