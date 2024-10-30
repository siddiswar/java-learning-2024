package com.learning.training.part5classandobjectbasics.gettersandsetters;

public class Student {

    //Member Variables
    private int studentId;
    private int studentAge;

    //Getters and Setters are nothing but member methods with a special purpose
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        if (studentAge > 0) {
            this.studentAge = studentAge;
        } else {
            System.out.println("Invalid age supplied : " + studentAge);
            this.studentAge = 0;
        }
    }
}
