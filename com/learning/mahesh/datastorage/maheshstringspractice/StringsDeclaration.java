package com.learning.mahesh.datastorage.maheshstringspractice;

public class StringsDeclaration {
    public static void main(String[] args) {

        String message = "HELLO, HOW ARE YOU";
        String greeting = "I HOPE YOU ARE DOING WELL";

        System.out.println("Message: " + message);
        System.out.println("Greeting: " + greeting);

        String fullMessage = message + " " + greeting;
        System.out.println("Concatenated String: " + fullMessage);


        System.out.println("Length of 'message': " + message.length());

        System.out.println("Message in Lowercase: " + message.toLowerCase());

        System.out.println("Does the message contain 'HOW'? " + message.contains("HOW"));

        String replacedMessage = message.replace("HOW", "WHO");
        System.out.println("Replaced Message: " + replacedMessage);
    }
}