package com.learning.mahesh.part6oopsconcepts.abstractionclass.interfaces.passengerClass;

public class ChildPassenger implements Passenger {
    private int seatNumber;

    public ChildPassenger(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public void boardBus() {
        System.out.println("Child passenger boards the bus.");
    }

    @Override
    public void leaveBus() {
        System.out.println("Child passenger leaves the bus.");
    }

    @Override
    public int getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String getPassengerType() {
        return "Child";
    }
}
