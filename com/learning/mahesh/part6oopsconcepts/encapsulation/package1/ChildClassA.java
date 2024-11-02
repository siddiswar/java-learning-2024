package com.learning.mahesh.part6oopsconcepts.encapsulation.package1;

public class ChildClassA extends ParentClass {

    public String name1;
    protected String name2;
    String name3;
    private String name4;

    public void methodInClassA(){
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);
    }

}
