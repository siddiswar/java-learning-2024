package com.learning.training.part6oopsconcepts.abstraction.interfaces.carexample;

public interface ICar {

    //Member variables
    //Only public static final variables are allowed in interface
    public static final String a = "value";

    //Member methods

    //abstract Member methods
    public void startEngine();

    public void stopEngine();

    public void applyBrakes();

    public void transmission();

    public void turnOnHeadLamps();

    public void turnOffHeadLamps();

    public void soundHorn();

    //One or more default methods are allowed in interface
    public default void someDefaultMethod() {
        somePrivateMethod();
        System.out.println("I am a default method");
    }

    //One or more private methods are allowed in interface
    private void somePrivateMethod(){
        System.out.println("I am a private method");
    }

    private static void someStaticMethod(){
        System.out.println("I am a static method");
    }
}
