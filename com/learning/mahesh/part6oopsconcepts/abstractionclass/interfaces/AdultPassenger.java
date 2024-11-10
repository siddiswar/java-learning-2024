package com.learning.mahesh.part6oopsconcepts.abstractionclass.interfaces;

public class AdultPassenger implements Passenger {
    private int seatNumber;

    public AdultPassenger(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public void boardBus() {
        System.out.println("Adult passenger boards the bus.");
    }

    @Override
    public void leaveBus() {
        System.out.println("Adult passenger leaves the bus.");
    }

    @Override
    public int getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String getPassengerType() {
        return "Adult";
    }
}
