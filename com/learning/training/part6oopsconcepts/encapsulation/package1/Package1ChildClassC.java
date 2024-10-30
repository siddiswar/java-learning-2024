package com.learning.training.part6oopsconcepts.encapsulation.package1;

//This is subclass of class A within the same package

public class Package1ChildClassC extends Package1ClassA {

    public  void methodInClassC(){
//        System.out.println(privateVar); Not accessible
        System.out.println(protectedVar);
        System.out.println(publicVar);
        System.out.println(defaultVar);
    }
}
