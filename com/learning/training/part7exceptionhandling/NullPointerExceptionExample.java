package com.learning.training.part7exceptionhandling;

public class NullPointerExceptionExample {

    public static void main(String[] args) {

        System.out.println("------------Before-----------------");
        String fullName = null;
        int nameLength = 0;
        try { //try block contains the code where exception may occur
            nameLength = fullName.length();
        } catch (Exception e) { //Catch block has alternate code to execute in cas eof exception
            System.out.println("Null pointer exception is thrown");
            fullName = "";
            nameLength = fullName.length();
            System.out.println(e.getMessage()); // To get exception message
            e.printStackTrace(); // To print whole exception
        }finally { // finally block gets executed irrespective of whether there is an exception or not
            System.out.println("Name Length is :" + nameLength);
        }
        System.out.println("------------After-----------------");


        //Real example

        //open database connection
        //fetch values from database
        //write your logic which consumes those values
        //generate output
        //close database connection

        try{
            //open database connection
            //fetch values from database
            //write your logic which consumes those values
            //generate output
        }catch (Exception e){
            // write your alternate code to handle exception
        }finally {
            //close database connection
        }

    }

}
