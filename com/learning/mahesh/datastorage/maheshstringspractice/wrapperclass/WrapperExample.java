package com.learning.mahesh.datastorage.maheshstringspractice.wrapperclass;

public class WrapperExample {
    public static void main(String[] args) {
        // Autoboxing: primitive to wrapper
        int primitiveInt = 5;
        Integer wrappedInt = primitiveInt; // Autoboxing

        // Unboxing: wrapper to primitive
        Integer wrappedInteger = Integer.valueOf(10);
        int unboxedInt = wrappedInteger; // Unboxing

        System.out.println("Wrapped Integer: " + wrappedInt);
        System.out.println("Unboxed Integer: " + unboxedInt);
    }
}
