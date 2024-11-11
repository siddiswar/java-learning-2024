package com.learning.mahesh.part6oopsconcepts.abstractionclass.abstraction.airlineticketbooking;

import com.learning.mahesh.part6oopsconcepts.abstractionclass.abstraction.airlineticketbooking.TicketBooking;

public abstract class AirIndia extends TicketBooking {
    public double ticketPrice;

    public AirIndia(int passengerage, char gender, String profession, String tickettype, double ticketPrice) {
        super(passengerage, gender, profession, tickettype);
        this.ticketPrice = ticketPrice;
    }

    public double calculateDiscount() {
        double discount = 0.0;


        if (profession.equalsIgnoreCase("Armed Forces")) {
            discount = 0.20;
        } else if (profession.equalsIgnoreCase("Police")) {
            discount = 0.15;
        }
        return ticketPrice - (ticketPrice * discount);
    }

    public int determineTicketType() {
        if (ticketPrice <= 200) {
            System.out.println("Ticket type: Economy");
        } else if (ticketPrice <= 500) {
            System.out.println("Ticket type: Business");
        } else {
            System.out.println("Ticket type: First Class");
        }
        return 0;
    }
}
