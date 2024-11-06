package com.learning.mahesh.part6oopsconcepts.abstraction.automobilefeature;

public abstract class VehicleFeature {
    public String sunroof;
    public String autopilot;
    public String cruisecontrol;
    public String airbags;
    public String soundhorn;
    public String rearcam;

    public VehicleFeature(String airbags, String soundhorn) {
        this.airbags = airbags;
        this.soundhorn = soundhorn;

    }
    public void airBags(){
        System.out.println("available for all the varients and brands");
    }
    public void soundHorn(){
        System.out.println("available for all the varients and brands");
    }

    public abstract void cruiseControl();

    public abstract void rearCam();

    public abstract void sunroof();

    public abstract void autopilot();
}
