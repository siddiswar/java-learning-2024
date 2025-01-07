package com.learning.training.part1tostoredata.collections;

import java.util.HashSet;
import java.util.Set;

public class SetCollection {
    public static void main(String[] args) {
        Set<String> subjectsSet = new HashSet<>();
        //Set is unordered collection . It doesn't maintain the order in which elements are added
        //Set doesn't contain duplicates
        //To add element to a Set
        subjectsSet.add("Maths");
        subjectsSet.add("Science");
        subjectsSet.add("English");
        subjectsSet.add("Physics");
        subjectsSet.add("Chemistry");
        subjectsSet.add("Maths");

        System.out.println(subjectsSet);

        //Since Set is unordered, there is no index associated with elements, so we can't access using index
        //Accessing elements present in Set using for each loop
        for (String eachSubject : subjectsSet) {
            System.out.println(eachSubject);
        }

        //size of the Set
        System.out.println(subjectsSet.size());

        System.out.println(subjectsSet.contains("Maths"));

        subjectsSet.remove("Maths");
        System.out.println(subjectsSet);

        subjectsSet.clear();
        System.out.println(subjectsSet.size());
    }
}
