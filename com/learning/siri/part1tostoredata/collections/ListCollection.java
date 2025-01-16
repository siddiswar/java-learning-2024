package com.learning.siri.part1tostoredata.collections;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class ListCollection {
    public static void main(String[] args) {

        List<String> subjectsList =new ArrayList<>();

        subjectsList.add("Maths");
        subjectsList.add("Science");
        subjectsList.add("English");
        subjectsList.add("Physics");
        subjectsList.add("Chemistry");
        subjectsList.add("Maths");

        subjectsList.add(4,"Chemistry 5");

        System.out.println("..................................................");

        for(int i=0;i < subjectsList.size();i++) {
            System.out.println(subjectsList.get(i));
        }

        System.out.println(".......................................");

        subjectsList.remove("Science");

        if(subjectsList.contains("English")) {
            System.out.println("true");
        }
        System.out.println("...............................");

        for(String eachSubject: subjectsList){
            System.out.println(eachSubject);
        }
        subjectsList.clear();
        System.out.println(subjectsList.size()
        );
    }


}
