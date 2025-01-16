package com.learning.siri.part1tostoredata.wrapperclass;

public class IntegerWrapperClass {
    public static void main(String[] args) {

        int primitiveVar =10;
        Integer intWrapperObj =12;


        System.out.println("Primitive variable value"+ primitiveVar);
        System.out.println("wrapper variable value"+ intWrapperObj);

        System.out.println(intWrapperObj.toString());

        System.out.println("Float value is :" + intWrapperObj.floatValue());

        System.out.println("double value is :" + intWrapperObj.doubleValue());

        String s1 = "123";
        Integer a = Integer.parseInt(s1);
        System.out.println("String parsed to Integer:" + a);

        System.out.println(intWrapperObj.compareTo(12));
        System.out.println(intWrapperObj.compareTo(17));

        System.out.println(intWrapperObj.compareTo(12));
        System.out.println(intWrapperObj.compareTo(42));
        System.out.println(intWrapperObj.compareTo(12));
    }
}
