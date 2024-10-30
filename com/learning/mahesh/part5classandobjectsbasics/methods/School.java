package com.learning.mahesh.part5classandobjectsbasics.methods;

public class School {
    int students;
    double marks;
    char grades;
    char section;

    public School(int students, double marks, char grades, char section) {
        this.students = students;
        this.marks = marks;
        this.grades = grades;
        this.section = section;
    }

    public void printDetails() {
        System.out.println("Section: " + section + ", Students: " + students + ", Marks: " + marks + ", Grade: " + grades);
    }

    public void updateMarks(double newMarks) {
        marks = newMarks;
    }

    public void assignGrade() {
        if (marks >= 90) grades = 'A';
        else if (marks >= 80) grades = 'B';
        else if (marks >= 70) grades = 'C';
        else if (marks >= 60) grades = 'D';
        else grades = 'F';
    }


    public static void main(String[] args) {
        School sectionA = new School(30, 85.5, 'B', 'A');
        sectionA.printDetails();

        sectionA.updateMarks(92.0);
        sectionA.assignGrade();

        sectionA.printDetails();
    }
}
