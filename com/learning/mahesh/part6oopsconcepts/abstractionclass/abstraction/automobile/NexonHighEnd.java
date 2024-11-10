package com.learning.mahesh.part6oopsconcepts.abstractionclass.abstraction.automobile;

public class NexonHighEnd extends NexonBase {

    public NexonHighEnd(String airbags, String soundhorn, String cruisecontrol, String rearcam) {
        super(airbags, soundhorn, cruisecontrol, rearcam);
    }



    public void cruiseControl() {
        System.out.println("Cruise control is available in the base variant.");
    }


    public void rearCam() {
        System.out.println("Rear camera is available in the base variant.");
    }


    public void sunroof() {
        System.out.println(" sunroof available .");
    }


    public void autopilot() {
        System.out.println("Autopilot feature is available in this variant.");
    }
}

