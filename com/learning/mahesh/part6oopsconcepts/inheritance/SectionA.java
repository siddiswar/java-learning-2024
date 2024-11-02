package com.learning.mahesh.part6oopsconcepts.inheritance;

public class SectionA  {
    public String social;
    public String math;
    public String science;
    private static String studentName = "kmr";
    public static final String SCHOOL_NAME = "ABCSchool";

    public SectionA(String social, String math, String science) {
        this.social = social;
        this.math = math;
        this.science = science;

    }

    public static void main(String[] args) {
        System.out.println("social added as subject");
        System.out.println("math added as subject");
        System.out.println("science added as subject");

    }

}
