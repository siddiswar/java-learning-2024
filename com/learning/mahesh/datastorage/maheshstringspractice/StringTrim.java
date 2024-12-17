package com.learning.mahesh.datastorage.maheshstringspractice;

public class StringTrim {
    public static void main(String[] args) {

        String originalString = "   HOW ARE YOU   ";


        String trimmedString = originalString.trim();


        System.out.println("Original String: '" + originalString + "'");
        System.out.println("Trimmed String: '" + trimmedString + "'");
    }
}
