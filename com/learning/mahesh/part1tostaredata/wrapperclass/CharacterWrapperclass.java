package com.learning.mahesh.part1tostaredata.wrapperclass;

public class CharacterWrapperclass {
    public static void main(String[] args) {

        char primitiveCharVar = 'k';
        Character wrapperCharObj = 'k';

        wrapperCharObj.toString();


        System.out.println(wrapperCharObj.equals('k'));
        System.out.println(wrapperCharObj.equals('a'));
        System.out.println(wrapperCharObj.equals('K'));

        System.out.println(wrapperCharObj.compareTo('k'));
        System.out.println(wrapperCharObj.compareTo('i'));
        System.out.println(wrapperCharObj.compareTo('n'));
    }
}
