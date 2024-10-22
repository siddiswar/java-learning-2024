package com.learning.siri.part5classandobjectbasics;

public class Employee {

    //Data (Variables)
    String name;
    long empId;
    int rating;
    int holidaysTaken;

    // Constructor
    Employee(String giveName,long givenEmpId, int givenRating, int givenholidaysTaken){
        name = giveName;
        empId = givenEmpId;
        rating = givenRating;
        holidaysTaken = givenholidaysTaken;
    }
    //Behaviour (methods)


    public long getEmpBonus(){
        long empBonus = 0;
        if(holidaysTaken == 0) {
            empBonus = 10000;
        }else{
            empBonus = 5000;
        }
        return empBonus;
    }

    public double getEmployeeHike(){
        double empHike = 0;
        if(rating >=4){
            empHike = 10;
        } else if (rating >= 3 && rating < 4){
            empHike = 8;
        }else{
            empHike = 5;
        }

        return  empHike;
    }

    public static void main(String[] args){
        // Creating an Object
        Employee sirisha = new Employee( "Sirisha deevi", 1,4,10);
        //To access variables(data)for the object
        System.out.println(sirisha.name);
        System.out.println(sirisha.empId);
        System.out.println(sirisha.holidaysTaken);
        System.out.println(sirisha.rating);

        //TO access method(behaviour)of the object
        long sirishaBonus = sirisha.getEmpBonus();
        System.out.println(sirishaBonus);


        double sirishaHike =sirisha.getEmployeeHike();
        System.out.println(sirishaHike);



    }
}
