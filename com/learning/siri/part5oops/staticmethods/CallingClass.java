package com.learning.siri.part5oops.staticmethods;

public class CallingClass {

    public void someMethod(){
        Emp.establishDbConnection(); //Static method is accessed using the class name
        Emp siri = new Emp();
    }
}
