package com.learning.training.part5oops.oopsbasics.staticmethods;

public class CallingClass {

    public void someMethod(){
        Emp.establishDbConnection(); //Static method is accessed using the class name
        Emp siri = new Emp();
    }
}
