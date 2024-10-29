package com.learning.mahesh.part5classandobjectsbasics.variabletypes;

public class FlightTicketBooking {
    String flightName;
    int ticketFare;
    int luggage;
    int insurance;

    public FlightTicketBooking(String givenFlightName, int givenTicketFare, int givenLuggage, int givenInsurance) {
        flightName = givenFlightName;
        ticketFare = givenTicketFare;
        luggage = givenLuggage;
        insurance = givenInsurance;
    }

    public void TicketFare(int TicketBookingAmout){
        if(TicketBookingAmout == 200){
            System.out.println("ticket booked in economy Class");
        }else if (TicketBookingAmout >= 201 && TicketBookingAmout <= 600 ){
            System.out.println("Booked bussiness class ticket");
        }else if (TicketBookingAmout > 601 ){
            System.out.println("booked first class ticket");
        }
    }

    public void Lagguage(int PassengerLagguage){
        if (PassengerLagguage > 50 && PassengerLagguage <=60){
            System.out.println("you are charged 100 extra for excess laggage");
        }else if (PassengerLagguage > 60){
            System.out.println("you are charged extra 200 for excess laggage");
        }else {
            System.out.println("you are not charged for lagguage");
        }
    }


    public void checkInsurance() {
        if (insurance == 50) {
            System.out.println("Insurance: Lost luggage protection with full refund");
        } else if (insurance == 100) {
            System.out.println("Insurance: Full medical coverage included");
        } else {
            System.out.println("No valid insurance plan selected.");
        }
    }

    public static void main(String[] args) {

        FlightTicketBooking booking = new FlightTicketBooking("Jet Airways", 600, 55, 50);
        booking.TicketFare(200);
        booking.Lagguage(60);
        booking.checkInsurance();
    }
}