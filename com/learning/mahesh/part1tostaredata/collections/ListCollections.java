package com.learning.mahesh.part1tostaredata.collections;

import java.util.ArrayList;
import java.util.List;

public class ListCollections {
    public static void main(String[] args) {
        

        List<String> subjectsList = new ArrayList<>();
        
        subjectsList.add("Maths");
        subjectsList.add("Science");
        subjectsList.add("English");
        subjectsList.add("Physics");
        subjectsList.add("Chemistry");
        subjectsList.add("Maths");

        
        subjectsList.add(4, "Physics 4");

     
        for (int i = 0; i < subjectsList.size(); i++) {
            System.out.println(subjectsList.get(i));
        }
 
        subjectsList.remove("Science");

       
        if (subjectsList.contains("English")) {
            System.out.println("true");
        }

       
        for (String eachSubject : subjectsList) {
            System.out.println(eachSubject);
        }

     
        subjectsList.clear();
        System.out.println(subjectsList.size());
    }
}
