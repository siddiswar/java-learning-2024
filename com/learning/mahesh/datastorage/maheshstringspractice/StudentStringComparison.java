package com.learning.mahesh.datastorage.maheshstringspractice;

public class StudentStringComparison {
    public static void main(String[] args) {

        String student1 = "mike";
        String student2 = "tyson";
        String student3 = "bob";
        String student4 = new String("joe");


        System.out.println("Comparing student names using equals():");
        System.out.println("Is student1's name equal to student2's? " + student1.equals(student2)); // false
        System.out.println("Is student1's name equal to student3's? " + student1.equals(student3)); // true
        System.out.println("Is student1's name equal to student4's? " + student1.equals(student4)); // true


        System.out.println("\nComparing student names using ==:");
        System.out.println("Is student1 the same object as student2? " + (student1 == student2)); // false
        System.out.println("Is student1 the same object as student3? " + (student1 == student3)); // true
        System.out.println("Is student1 the same object as student4? " + (student1 == student4)); // false


        String student5 = "alice"; // Same name as student1 but lowercase
        System.out.println("\nComparing student names using equalsIgnoreCase():");
        System.out.println("Is student1's name equal to student5's (case ignored)? " + student1.equalsIgnoreCase(student5)); // true


        System.out.println("\nComparing student names using compareTo():");
        System.out.println("Comparing student1 and student2: " + student1.compareTo(student2));
        System.out.println("Comparing student2 and student1: " + student2.compareTo(student1));
        System.out.println("Comparing student1 and student3: " + student1.compareTo(student3));


        System.out.println("\nUsing regionMatches():");
        String student6 = "Alice Johnson";
        String student7 = "Johnson";
        System.out.println("Does 'Alice Johnson' have 'Johnson' starting at position 6? "
                + student6.regionMatches(6, student7, 0, 7)); // true
    }
}
