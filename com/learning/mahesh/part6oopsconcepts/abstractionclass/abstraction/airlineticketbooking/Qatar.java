package com.learning.mahesh.part6oopsconcepts.abstractionclass.abstraction.airlineticketbooking;

public abstract class Qatar extends TicketBooking {
    public double ticketPrice = 0;

    public Qatar(int passengerage, char gender, String profession, String tickettype, double ticketPrice) {
        super(passengerage, gender, profession, tickettype);
        this.ticketPrice = ticketPrice;
    }

    public double calculateDiscount() {
        double discount = 0.0;


        if (super.profession.equalsIgnoreCase("Armed Forces")) {
            discount = 0.10;
        } else if (super.profession.equalsIgnoreCase("Police")) {
            discount = 0.09;
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
