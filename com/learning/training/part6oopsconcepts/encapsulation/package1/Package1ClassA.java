package com.learning.training.part6oopsconcepts.encapsulation.package1;

public class Package1ClassA {

    private String privateVar;
    protected String protectedVar;
    public String publicVar;
    String defaultVar;


    public  void methodInClassA(){
        System.out.println(privateVar);
        System.out.println(protectedVar);
        System.out.println(publicVar);
        System.out.println(defaultVar);
    }
}