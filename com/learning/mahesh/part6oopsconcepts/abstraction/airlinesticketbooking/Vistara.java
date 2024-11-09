package com.learning.mahesh.part6oopsconcepts.abstraction.airlinesticketbooking;

public abstract class Vistara extends TicketBooking {
    public double ticketPrice;  // Changed to double for compatibility with discount calculation

    public Vistara(int passengerage, char gender, String profession, String tickettype, double ticketPrice) {
        super(passengerage, gender, profession, tickettype);
        this.ticketPrice = ticketPrice;
    }

    public double calculateDiscount() {
        double discount = 0.0;

        if (profession.equalsIgnoreCase("Armed Forces")) {
            discount = 0.25;
        } else if (profession.equalsIgnoreCase("Police")) {
            discount = 0.16;
        }


        return ticketPrice - (ticketPrice * discount);
    }

    public int determineTicketType() {
        if (ticketPrice <= 250) {
            System.out.println("Ticket type: Economy");
        } else if (ticketPrice <= 560) {
            System.out.println("Ticket type: Business");
        } else {
            System.out.println("Ticket type: First Class");
        }
        return 0;
    }
}