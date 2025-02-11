package com.learning.siri.part1tostoredata.collections;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {
        Set<String> subjectsSet = new HashSet<>();

        subjectsSet.add("Maths");
        subjectsSet.add("Science");
        subjectsSet.add("English");
        subjectsSet.add("Physics");
        subjectsSet.add("Chemistry");
        subjectsSet.add("Maths");

        System.out.println(subjectsSet);

        for(String eachSubject : subjectsSet) {
            System.out.println(eachSubject);
        }

        System.out.println(subjectsSet.size());

        System.out.println(subjectsSet.contains("Physics"));

        subjectsSet.remove( "Maths");
        System.out.println(subjectsSet);

        subjectsSet.clear();
        System.out.println(subjectsSet.size());
    }
}
