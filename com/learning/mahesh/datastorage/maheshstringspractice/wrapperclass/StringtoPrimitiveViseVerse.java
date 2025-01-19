package com.learning.mahesh.datastorage.maheshstringspractice.wrapperclass;

public class StringtoPrimitiveViseVerse {
        public static void main(String[] args) {
            // String to primitive
            String strNumber = "123";
            int number = Integer.parseInt(strNumber); // Parsing String to int

            // Primitive to String
            int anotherNumber = 456;
            String strAnotherNumber = Integer.toString(anotherNumber);

            System.out.println("Parsed number: " + number);
            System.out.println("String from number: " + strAnotherNumber);
        }
}

