package com.learning.training.part6oopsconcepts.encapsulation.package1;

//This is different class but in the same package
public class Package1ClassB {

    public void someMethod(){
        Package1ClassA obj1 = new Package1ClassA();
//            System.out.println(obj1.privateVar); Not accessible
            System.out.println(obj1.protectedVar);
            System.out.println(obj1.publicVar);
            System.out.println(obj1.defaultVar);
        }

}

