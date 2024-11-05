package com.learning.mahesh.part6oopsconcepts.polymorphism.overloading;

public class PersonDetails {
    public void printDetails() {
        System.out.println("Name: Mahesh");
    }


    public void printDetails(String name, char gender) {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
    }


    public void printDetails(String name, char gender, int age) {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
    }


    public void printDetails(String name, char gender, int age, String school) {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("School: " + school);
    }


    public void printDetails(String name, char gender, int age, String school, double height, double weight) {
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("School: " + school);
        System.out.println("Height: " + height + " feet");
        System.out.println("Weight: " + weight + " kg");
    }

    public static void main(String[] args) {
        PersonDetails person = new PersonDetails();


        person.printDetails();
        person.printDetails("Mahesh", 'M');
        person.printDetails("Mahesh", 'M', 28);
        person.printDetails("Mahesh", 'M', 28, "KRRS");
        person.printDetails("Mahesh", 'M', 28, "KRRS", 5.7, 77);
    }
}