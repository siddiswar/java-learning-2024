package com.learning.mahesh.part6oopsconcepts.inheritance;

import com.sun.tools.javac.Main;

public class SectionC extends SectionB{
    public String hin;
    public SectionC(String social, String math, String science, String hin) {
        super(social, math, science);
        this.hin = hin;

    }

    public static void main(String[] args) {
        System.out.println("hin added as second lang for sec C");
    }

}
