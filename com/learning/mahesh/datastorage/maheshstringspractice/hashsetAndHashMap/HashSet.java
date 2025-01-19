package com.learning.mahesh.datastorage.maheshstringspractice.hashsetAndHashMap;

public class HashSet {
    public static void main(String[] args) {
        // Create a HashSet
        java.util.HashSet<String> hashSet = new java.util.HashSet<>();

        // Add elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Apple");


        System.out.println("HashSet: " + hashSet);


        System.out.println("Contains 'Banana': " + hashSet.contains("Banana"));


        hashSet.remove("Cherry");
        System.out.println("After removing 'Cherry': " + hashSet);


        System.out.println("Iterating through HashSet:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }
    }
}