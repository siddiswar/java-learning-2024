package com.learning.mahesh.datastorage.maheshstringspractice;

public class SubStrings {
    public static void main(String[] args) {
        // Original string
        String message = "HELLO, HOW ARE YOU";

        String sub1 = message.substring(7);
        String sub2 = message.substring(0, 5);
        String sub3 = message.substring(7, 10);

        System.out.println("Original String: " + message);
        System.out.println("Substring from index 7: " + sub1);
        System.out.println("Substring from index 0 to 5: " + sub2);
        System.out.println("Substring from index 7 to 10: " + sub3);
    }
}
