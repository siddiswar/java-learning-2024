package com.learning.training.part1tostoredata.variables.primitivedatatypes;

public class PrimitiveVariables {

    public static void main(String[] args){

        byte byteVariable = 100;
        System.out.println("byte value: " + byteVariable);

        short shortvariable = 1000;
        System.out.println("short value: " + shortvariable);

        int intvariable = 10000000;
        System.out.println("int value: " + intvariable);

        long longvariable = 10000000000L;
        System.out.println("long value: " + longvariable);

        double dobulevariable = 23.56;
        System.out.print("dobulevalue: " + dobulevariable);

        float floatvariable = 23.1F;
        System.out.print("floatvalue: "+ floatvariable);

        boolean booleanvariable = true;
        System.out.print("booleanvalue: " + booleanvariable);

        char charvariable = 'a';
        System.out.println("charvalue: " + charvariable);

        int pritiveIntVar = 5;
        int anotherPritiveIntVar = 7;
        if(pritiveIntVar>anotherPritiveIntVar){
            System.out.println("bigger");
        }else{
            System.out.println("smaller");
        }
        Integer wrapperIntVar = 5;
        Integer anotherWrapperIntVar = 5;

        System.out.println(wrapperIntVar.compareTo(anotherWrapperIntVar));




    }
}
