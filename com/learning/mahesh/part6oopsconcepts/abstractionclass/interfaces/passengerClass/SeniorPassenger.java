package com.learning.mahesh.part6oopsconcepts.abstractionclass.interfaces.passengerClass;

import com.learning.mahesh.part6oopsconcepts.abstractionclass.interfaces.passengerClass.Passenger;

public class SeniorPassenger implements Passenger {
    private int seatNumber;

    public SeniorPassenger(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    @Override
    public void boardBus() {
        System.out.println("Senior passenger boards the bus.");
    }

    @Override
    public void leaveBus() {
        System.out.println("Senior passenger leaves the bus.");
    }

    @Override
    public int getSeatNumber() {
        return seatNumber;
    }

    @Override
    public String getPassengerType() {
        return "Senior";
    }
}