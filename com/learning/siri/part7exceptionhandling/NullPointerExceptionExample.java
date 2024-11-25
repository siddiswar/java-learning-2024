package com.learning.siri.part7exceptionhandling;

public class NullPointerExceptionExample {

    public static void main(String[] args) {

        System.out.println("------------Before-----------------");
        String fullName = null;
        int nameLength = 0;
        try {
            nameLength = fullName.length();
        } catch (Exception e) {
            System.out.println("Null pointer exception is thrown");
            fullName = "";
            nameLength = fullName.length();
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally {
            System.out.println("Name Length is :" + nameLength);
        }
        System.out.println("------------After-----------------");

        try {
        } catch (Exception e) {
        } finally {

        }
    }
}