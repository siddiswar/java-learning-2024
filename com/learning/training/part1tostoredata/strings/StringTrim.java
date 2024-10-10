package com.learning.training.part1tostoredata.strings;

public class StringTrim {
    public static void main(String[] args) {

        String fullName = " Sachin Ramesh Tendulkar ";
        System.out.println(fullName);

        //trim() method trims leading and trailing spaces
        String trimmedString = fullName.trim();
        System.out.println(trimmedString);
    }
}