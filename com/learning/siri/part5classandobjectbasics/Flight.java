package com.learning.siri.part5classandobjectbasics;

public class Flight {

    //data (variables)

    String flightNumber;
    String airLines;
    String departureAirport;
    String arrivalAirport;
    int durationInMins;
    double totalExpenditure;
    int totalOccupancy;
    double pricePerSeat;
    String status;

    // Constructor

    public Flight(String flightNumber, String airLines, String departureAirport, String arrivalAirport, int durationInMins, double totalExpenditure, int totalOccupancy, double pricePerSeat, String status) {
        this.flightNumber = flightNumber;
        this.airLines = airLines;
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
        this.durationInMins = durationInMins;
        this.totalExpenditure = totalExpenditure;
        this.totalOccupancy = totalOccupancy;
        this.pricePerSeat = pricePerSeat;
        this.status = status;  //OnTime, Delayed, Cancelled
    }


    // method


    public double getTotalEarningsOnTickets() {
        double earnings = totalOccupancy * pricePerSeat;
        System.out.println("Earning on tickets : " + earnings);
        return earnings;
    }

    //flight delayed => Howmuch delay time,partial refunds
    public void flightDelayed(int delayInMinutes) {
        durationInMins = durationInMins + delayInMinutes;
        if (delayInMinutes > 0 && delayInMinutes < 60) {
            pricePerSeat = pricePerSeat * (.75);
        } else if (delayInMinutes > 60) {
            pricePerSeat = pricePerSeat / 2;
        } else {
            pricePerSeat = pricePerSeat;
        }
        System.out.println("New Flight Duration : " + durationInMins);
        System.out.println("New price per seat : " + pricePerSeat);
    }

    //flight cancelled => refunds
    public void flightCanceled() {
        durationInMins = 0;
        pricePerSeat = 0;
        System.out.println("New Flight Duration : " + durationInMins);
        System.out.println("New price per seat : " + pricePerSeat);
    }


    public static void main(String[] args) {

        System.out.println("============values if not dalayed=================");
        Flight hydFlight = new Flight("AI23", "Air India", "Heathrow", "Hyderabad", 600, 10000, 125, 423.5, "OnTime");

        hydFlight.flightDelayed(0);



        System.out.println("============values if dalayed by less than 60 mins=================");
        Flight chennaiFlight = new Flight("AI23", "Air India", "Heathrow", "Chennai", 660, 12000, 125, 460.5, "Delayed");
        chennaiFlight.flightDelayed(25);



        System.out.println("============values if dalayed by more than 60 mins=================");
        Flight bloreFlight = new Flight("AI23", "Air India", "Heathrow", "Bangalore", 660, 12000, 125, 460.5, "Delayed");
        bloreFlight.flightDelayed(75);



        System.out.println("============values if cancelled=================");
        Flight puneFlight = new Flight("AI23", "Air India", "Heathrow", "Pune", 660, 12000, 125, 460.5, "Cancelled");
        puneFlight.flightCanceled();

    }


}
