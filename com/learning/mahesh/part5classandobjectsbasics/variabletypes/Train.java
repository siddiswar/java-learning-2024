package com.learning.mahesh.part5classandobjectsbasics.variabletypes;

public class Train {
    String name;
    int availableseats = 4;
    String destination;
    int coaches;
    int platform;

    //constructer
    public Train(String givenname, int givenmaxbookings, String givendestination, int givencoaches, int givenplatform) {
        name = givenname;
        availableseats = givenmaxbookings;
        destination = givendestination;
        coaches = givencoaches;
        platform = givenplatform;
    }

      //methosd
    public void booking(int newBooking) {
        if (newBooking > availableseats) {
            System.out.println("Only " + availableseats + " seats available.");
        } else {
            availableseats -= newBooking;
            System.out.println("Ticket(s) booked successfully. Remaining seats: " + availableseats);
        }
    }

    public static void main(String[] args) {
        Train train = new Train("XYZ Express", 4, "Hyd to Bangalore", 8, 8);

        System.out.println("Train Name: " + train.name);
        System.out.println("Destination: " + train.destination);
        System.out.println("Coaches: " + train.coaches);
        System.out.println("Platform: " + train.platform);
        System.out.println("Available Seats: " + train.availableseats);

        train.booking(6);
        train.booking(6);
        train.booking(6);
    }
}
