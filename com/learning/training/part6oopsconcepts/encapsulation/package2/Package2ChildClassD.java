package com.learning.training.part6oopsconcepts.encapsulation.package2;

import com.learning.training.part6oopsconcepts.encapsulation.package1.Package1ClassA;

//This is subclass of class A within the different package

public class Package2ChildClassD extends Package1ClassA {
    public void methodInClassC() {
//        System.out.println(privateVar);  Not accessible
        System.out.println(protectedVar);
        System.out.println(publicVar);
//        System.out.println(defaultVar);  Not accessible
    }
}
