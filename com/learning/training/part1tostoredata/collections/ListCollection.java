package com.learning.training.part1tostoredata.collections;

import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {
        //List is Ordered collection . It maintains the order in which elements are added
        //Set doesn't contain duplicates

        List<String> subjectsList = new ArrayList<>();
        //To add element to a list
        subjectsList.add("Maths");
        subjectsList.add("Science");
        subjectsList.add("English");
        subjectsList.add("Physics");
        subjectsList.add("Chemistry");
        subjectsList.add("Maths");

        //To update element of a list at a particular index
        subjectsList.add(4, "Physics 4");

        System.out.println("----------------------------------------------------");

        //to access values of a List using index
        for (int i = 0; i < subjectsList.size(); i++) {
            System.out.println(subjectsList.get(i));
        }

        System.out.println("----------------------------------------------------");

        //To delete a particular elements present in the list
        subjectsList.remove("Science");

        //To check if a particular element is present in the list
        if (subjectsList.contains("English")) {
            System.out.println("true");
        }

        System.out.println("----------------------------------------------------");

        //to access values of a List using for each loop (or) advanced for loop
        for (String eachSubject : subjectsList) {
            System.out.println(eachSubject);
        }

        //To delete all elements present in the list
        subjectsList.clear();
        System.out.println(subjectsList.size());
    }
}
