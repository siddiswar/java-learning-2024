package com.learning.mahesh.part6oopsconcepts.abstractionclass.abstraction.airlineticketbooking.TicketBooking;

public abstract class TicketBooking {

    public char gender;
    public String profession;
    public String tickettype;

    public TicketBooking(int passengerage, char gender, String profession, String tickettype) {

        this.gender = gender;
        this.profession = profession;
        this.tickettype = tickettype;


    }


    public void passengergender() {
        if (gender == 'm') {
            System.out.println("passenger is male");
        } else if (gender == 'f') {
            System.out.println("passenger gender if female");
        } else {
            System.out.println("gender not specified");
        }

    }

    public abstract double calculateDiscount();

    public abstract int determineTicketType();

}
