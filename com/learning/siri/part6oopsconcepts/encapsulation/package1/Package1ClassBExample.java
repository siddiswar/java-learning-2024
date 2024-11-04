package com.learning.siri.part6oopsconcepts.encapsulation.package1;


public class Package1ClassBExample {
    public void someMethod(){
        Package1ClassAExample obj1 = new Package1ClassAExample();

        System.out.println(obj1.protectedVar);
        System.out.println(obj1.publicVar);
        System.out.println(obj1.defaultVar);

    }
}


