package com.learning.training.part6oopsconcepts.abstraction.interfaces.carexample;

public abstract class TataCar implements ICar{
    @Override
    public void startEngine() {
        System.out.println("Engine turned on");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine turned off");
    }

    @Override
    public void applyBrakes() {
        System.out.println("applying brakes");
    }

    @Override
    public void turnOnHeadLamps() {
        System.out.println("Head lamps turned on");
    }

    @Override
    public void turnOffHeadLamps() {
        System.out.println("Head lamps turned off");
    }

    @Override
    public void soundHorn() {
        System.out.println("Sounding Horn");
    }
}
