package com.learning.mahesh.datastorage.maheshstringspractice.hashsetAndHashMap;

public class HashMap {
    public static void main(String[] args) {
        java.util.HashMap<Integer, String> hashMap = new java.util.HashMap<>();

        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Cherry");
        hashMap.put(1, "Apricot");

        System.out.println("HashMap: " + hashMap);

        System.out.println("Value for key 2: " + hashMap.get(2));

        System.out.println("Contains key 3: " + hashMap.containsKey(3));
        System.out.println("Contains value 'Banana': " + hashMap.containsValue("Banana"));

        hashMap.remove(2);
        System.out.println("After removing key 2: " + hashMap);

        System.out.println("Iterating over HashMap:");
        for (Integer key : hashMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + hashMap.get(key));
        }
    }
}
