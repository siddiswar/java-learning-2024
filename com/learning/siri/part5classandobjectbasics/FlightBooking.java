package com.learning.siri.part5classandobjectbasics;

public class FlightBooking {

    //data (variables)
    String bookingId;
    String passengerName;
    String flightNumber;
    String bookingClass;
    String seatNumber;
    String travelDate;
    double bookingPrice;
    boolean isRescheduleAllowed;
    boolean isCancellationAllowed;

    double reFundAmount;

    // Constructor

    public FlightBooking(String bookingId, String passengerName, String flightNumber, String bookingClass, String seatNumber, String travelDate, double bookingPrice, boolean isRescheduleAllowed, boolean isCancellationAllowed, double reFundAmount) {
        this.bookingId = bookingId;
        this.passengerName = passengerName;
        this.flightNumber = flightNumber;
        this.bookingClass = bookingClass;
        this.seatNumber = seatNumber;
        this.travelDate = travelDate;
        this.bookingPrice = bookingPrice;
        this.isRescheduleAllowed = isRescheduleAllowed;
        this.isCancellationAllowed = isCancellationAllowed;
        this.reFundAmount = reFundAmount;
    }


    //Behaviour (methods)


    public void cancelBooking() {
        if (isCancellationAllowed) {
            reFundAmount = bookingPrice;
        } else {
            reFundAmount = bookingPrice / 2;
        }
    }

    public void rescheduleBooking(String newDate) {
        travelDate = newDate;
        if (isRescheduleAllowed) {
            bookingPrice = bookingPrice;
        } else {
            bookingPrice = bookingPrice + 100;
        }
    }

    public void upgradeBooking() {
        bookingPrice = bookingPrice + 200;
    }

    //main method
    public static void main(String[] args) {
        System.out.println("========================No Cancellations, No reschedules, no upgrades========================");
        FlightBooking booking1 = new FlightBooking("AI0001", "Siddu", "AI001", "ECONOMY", "A23", "25-Dec-2024", 423.24, true, true, 0);
        System.out.println("Booking Price : " + booking1.bookingPrice);
        System.out.println("Refund Amount : " + booking1.reFundAmount);


        System.out.println("========================Cancellation========================");
        FlightBooking booking2 = new FlightBooking("AI0002", "Mahesh", "AI001", "ECONOMY", "A24", "25-Dec-2024", 423.24, true, true, 0);
        booking2.cancelBooking();
        System.out.println("Booking Price : " + booking2.bookingPrice);
        System.out.println("Refund Amount : " + booking2.reFundAmount);

        System.out.println("========================Cancellation========================");
        FlightBooking booking3 = new FlightBooking("AI0002", "Ananya", "AI001", "ECONOMY", "A25", "25-Dec-2024", 423.24, true, false, 0);
        booking3.cancelBooking();
        System.out.println("Booking Price : " + booking3.bookingPrice);
        System.out.println("Refund Amount : " + booking3.reFundAmount);

    }


}

