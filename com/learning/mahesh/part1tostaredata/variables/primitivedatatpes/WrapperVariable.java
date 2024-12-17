package com.learning.mahesh.part1tostaredata.variables.primitivedatatpes;

public class WrapperVariable {
    public static void main(String[] args) {
        int primitiveInt = 42;


        Integer wrapperInt = primitiveInt;


        int unboxedInt = wrapperInt;

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Integer: " + wrapperInt);
        System.out.println("Unboxed int: " + unboxedInt);
    }
}