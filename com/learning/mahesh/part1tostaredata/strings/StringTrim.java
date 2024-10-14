package com.learning.mahesh.part1tostaredata.strings;

public class StringTrim {
    public static void main(String[] args) {
        String str1 = "      my name is mahesh         ";

        String trimmedstr = str1.trim();

        System.out.println("original:[" + str1 + "]");
        System.out.println("trimmed:[" + trimmedstr + "]");
    }
}
