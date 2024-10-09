package com.learning.siri.part1tostoredata.variables.primitivedatatypes;

public class variables {

    public static void main (String[] args){

        byte byteVariable = 100;
        System.out.println("byte value: "+ byteVariable);

        short shortVariable = 1000;
        System.out.println("short value: "+ shortVariable);

        int intVariable = 10000000;
        System.out.println("int value: "+ intVariable);

        long longVariable = 10000000000L;
        System.out.println("long value: "+ longVariable);

        double doubleVariable = 23.56;
        System.out.println("double value:"+ doubleVariable);

        float floatVariable = 23.1F;
        System.out.println("float value:"+ floatVariable);

        boolean booleanVariable =false;
        System.out.println("boolean value:"+ booleanVariable);

        char charVariable = 's';
        System.out.println("print value: " + charVariable);

        int primitiveIntVar = 6;
        int anotherPrimitiveIntvar = 7;
        if(primitiveIntVar>anotherPrimitiveIntvar){
            System.out.println("bigger");
        }else{
            System.out.println("smaller");
        }
        Integer WrapperIntVar = 5;
        Integer anotherWrapperIntVar = 5;

        System.out.println(WrapperIntVar.compareTo(anotherWrapperIntVar));



    }

}
