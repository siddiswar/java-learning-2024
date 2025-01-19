package com.learning.mahesh.part1tostaredata.wrapperclass;

public class IntegerWrapperClass {
    public static void main(String[] args) {

        int primitiveVar = 10;
        Integer intWrapperObj = 12;

        System.out.println("primitive variable value " + primitiveVar);
        System.out.println("wrapper variable value " + intWrapperObj);

        System.out.println(intWrapperObj.toString());
        System.out.println("Float value is : " + intWrapperObj.floatValue());
        System.out.println("double value is : " + intWrapperObj.doubleValue());


        String s1 = "123";
        Integer a = Integer.parseInt(s1);
        System.out.println("String parsed to Integer : " + a);

        System.out.println(intWrapperObj.equals(12));
        System.out.println(intWrapperObj.equals(15));

        System.out.println(intWrapperObj.compareTo(12));  //returns 0
        System.out.println(intWrapperObj.compareTo(11));  //returns 1
        System.out.println(intWrapperObj.compareTo(13));  //returns -1
    }
}
