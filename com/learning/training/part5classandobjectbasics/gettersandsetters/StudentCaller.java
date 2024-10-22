package com.learning.training.part5classandobjectbasics.gettersandsetters;

public class StudentCaller {
    public static void main(String[] args) {

        Student ananya = new Student();

        System.out.println(ananya.getStudentId());
        System.out.println(ananya.getStudentAge());

        //use setter methods to update the values
        ananya.setStudentId(1);
        ananya.setStudentAge(12);

        //Use getter methods to read the values
        System.out.println(ananya.getStudentId());
        System.out.println(ananya.getStudentAge());

        ananya.setStudentId(1);
        ananya.setStudentAge(-12);
    }
}
