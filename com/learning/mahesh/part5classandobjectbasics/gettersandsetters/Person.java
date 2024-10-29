package com.learning.mahesh.part5classandobjectbasics.gettersandsetters;

public class Person {

    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        if (age > 0) { // basic validation
            this.age = age;
        } else {
            System.out.println("Please enter a valid age.");
        }
    }
}
