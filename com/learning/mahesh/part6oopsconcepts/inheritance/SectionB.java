package com.learning.mahesh.part6oopsconcepts.inheritance;

public class SectionB extends SectionA{
    public String eng;

    public SectionB(String social, String math, String science) {
        super(social, math, science);
        this.eng = eng;


    }

    public static void main(String[] args) {
        System.out.println("eng added as sec lang for sec B");
    }

}
