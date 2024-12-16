package com.learning.mahesh.datastorage.maheshstringspractice;

public class StringsSplit {

        public static void main(String[] args) {

            String names = "Alice,Bob,Charlie,David,Eve";


            String[] nameArray = names.split(",");


            System.out.println("Split names:");
            for (String name : nameArray) {
                System.out.println(name);
            }

            String otherNames = "Alice;Bob;Charlie;David;Eve";
            String[] otherNameArray = otherNames.split(";");

            System.out.println("\nSplit names with semicolon delimiter:");
            for (String name : otherNameArray) {
                System.out.println(name);
            }
        }
}
