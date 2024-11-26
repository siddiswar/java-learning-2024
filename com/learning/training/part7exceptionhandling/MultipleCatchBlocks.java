package com.learning.training.part7exceptionhandling;

import java.io.File;

public class MultipleCatchBlocks {

    public static void main(String[] args) {

        System.out.println("------------Before -----------------");

        String fullName2 = null;
        int nameLength2 = 0;

        int a = 6;
        int b = 0;

        int[] intAr = {4, 23, 6};

        try { //try block contains the code where exception may occur
            System.out.println(a / b);  //Triggers ArithmeticException

            nameLength2 = fullName2.length(); //Triggers NullPointerException

            for (int i = 0; i <= intAr.length; i++) {
                System.out.println(intAr[i]); // Triggers IndexOutOfBoundsException
            }
        } catch (NullPointerException e) { // If NullPointerException occurs
            System.out.println("Null pointer exception is thrown");
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) { //// If ArithmeticException occurs
            System.out.println("ArithmeticException is thrown");
            System.out.println(e.getMessage()); // If any other exception occurs apart from above two
        } catch (Exception e) {
            System.out.println("Generic/common Exception");
            System.out.println(e.getMessage());
        }
        System.out.println("------------After-----------------");
    }
}
