package com.learning.training.part5oops.oopsbasics;

public class Employee {

    //Data (Variables)
    String name;
    long empId;
    int rating;
    int holidaysTaken;

    //Constructor
    Employee(String givenName, long givenEmpId, int givenRating, int givenHolidaysTaken) {
        name = givenName;
        empId = givenEmpId;
        rating = givenRating;
        holidaysTaken = givenHolidaysTaken;
    }

    //Behaviour (methods)

    public long getEmpBonus() {
        long empBonus = 0;
        if (holidaysTaken == 0) {
            empBonus = 10000;
        } else {
            empBonus = 5000;
        }
        return empBonus;
    }

    public double getEmployeeHike() {
        double empHike = 0;
        if (rating >= 4) {
            empHike = 10;
        } else if (rating >= 3 && rating < 4) {
            empHike = 8;
        } else {
            empHike = 5;
        }
        return empHike;
    }

    public static void main(String[] args) {
        //Creating an object
        Employee siri = new Employee("Sirisha Deevi", 1, 4, 10);
        //To access variables(data) for the object
        System.out.println(siri.name);
        System.out.println(siri.empId);
        System.out.println(siri.holidaysTaken);
        System.out.println(siri.rating);

        //To access methods(behaviour) of the object
        long siriBonus = siri.getEmpBonus();
        System.out.println(siriBonus);

        double siriHike = siri.getEmployeeHike();
        System.out.println(siriHike);

        System.out.println("-------------------------------------");
        //Create another object
        Employee mahesh = new Employee("Mahesh", 2, 5, 5);
        System.out.println(mahesh.name);
        System.out.println(mahesh.empId);
        System.out.println(mahesh.holidaysTaken);
        System.out.println(mahesh.rating);

        //To access methods(behaviour) of the object
        long maheshBonus = mahesh.getEmpBonus();
        System.out.println(maheshBonus);

        double maheshHike = mahesh.getEmployeeHike();
        System.out.println(maheshHike);
    }
}
