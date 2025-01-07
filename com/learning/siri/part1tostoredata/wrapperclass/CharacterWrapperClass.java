package com.learning.siri.part1tostoredata.wrapperclass;

public class CharacterWrapperClass {
    public static void main(String[] args) {

        char primitiveCharVar = 'S';
        Character wrapperCharObj = 'S';

        wrapperCharObj.toString();

        System.out.println(wrapperCharObj.equals('S'));
        System.out.println(wrapperCharObj.equals('A'));
        System.out.println(wrapperCharObj.equals('M'));


        System.out.println(wrapperCharObj.compareTo('S'));
        System.out.println(wrapperCharObj.compareTo('k'));
        System.out.println(wrapperCharObj.compareTo('n'));
    }
}
