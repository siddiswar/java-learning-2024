package com.learning.training.part1tostoredata.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapCollection {
    public static void main(String[] args) {
        //Map is a key value pair
        //Keys are unique.

        Map<Integer, String> empMap = new HashMap<>();
        empMap.put(11, "Siddu");
        empMap.put(12, "Siri");
        empMap.put(13, "Mahesh");
        empMap.put(14, "Ananya");
        empMap.put(15, "Siddu");
        System.out.println(empMap);

        //size of the map
        System.out.println(empMap.size());

        //to get all the keys
        System.out.println(empMap.keySet());

        //to get all the values
        System.out.println(empMap.values());

        //insert a duplicate entry into the map
        //Map doesn't allow duplicate keys.
        // Existing value will be overwritten when a new entry with existing key is inserted into Map
        empMap.put(13, "MaheshNew");
        System.out.println(empMap);

        //To get a value in map with given key
        System.out.println(empMap.get(12));

        //To delete an entry with given key
        empMap.remove(13);
        System.out.println(empMap);

        //To delete all the entries from the map
        empMap.clear();
        System.out.println(empMap);

        Map<Integer, String> empTable = new Hashtable<>();
    }
}
