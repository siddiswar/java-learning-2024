package com.learning.mahesh.part6oopsconcepts.abstractionclass.abstraction.automobile;

import com.learning.mahesh.part6oopsconcepts.abstractionclass.abstraction.automobile.VehicleFeature;

public abstract class NexonBase extends VehicleFeature {


    public NexonBase(String airbags, String soundhorn, String cruisecontrol, String rearcam) {
        super(airbags, soundhorn);
        this.cruisecontrol = cruisecontrol;
        this.rearcam = rearcam;
    }


    @Override
    public void cruiseControl() {
        System.out.println("Cruise control is available in the base variant.");
    }

    @Override
    public void rearCam() {
        System.out.println("Rear camera is available in the base variant.");
    }

    @Override
    public void sunroof() {
        System.out.println(" sunroof not available .");
    }

    @Override
    public void autopilot() {
        System.out.println("Autopilot feature is not available in this variant.");
    }
}
