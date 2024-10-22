package com.learning.siri.part5classandobjectbasics.staticmethods;

public class CallingClassExample {

    public void someMethod(){
        Emp.establishDbConnection(); //static method is accessed using the class name
        Emp siri = new Emp();
    }
}
