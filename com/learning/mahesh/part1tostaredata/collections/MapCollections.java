package com.learning.mahesh.part1tostaredata.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapCollections {
    public static void main(String[] args) {

        Map<Integer, String> empMap = new HashMap<>();
        empMap.put(11, "Siddu");
        empMap.put(12, "Siri");
        empMap.put(13, "Mahesh");
        empMap.put(14, "Ananya");
        empMap.put(15, "Siddu");
        System.out.println(empMap);


        System.out.println(empMap.size());


        System.out.println(empMap.keySet());

        System.out.println(empMap.values());

        empMap.put(13, "MaheshNew");
        System.out.println(empMap);


        System.out.println(empMap.get(12));


        empMap.remove(13);
        System.out.println(empMap);

        empMap.clear();
        System.out.println(empMap);

        Map<Integer, String> empTable = new Hashtable<>();
    }
}
