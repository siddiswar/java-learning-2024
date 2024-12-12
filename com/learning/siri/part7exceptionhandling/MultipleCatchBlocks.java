package com.learning.siri.part7exceptionhandling;

public class MultipleCatchBlocks {

    public static void main(String[] args) {

        System.out.println(".....................Before........................");

        String fullName2 = null;

        int nameLength2= 0;

        int a= 6;
        int b =9;

        int[] intAr= {6,45,7};

        try{
            System.out.println(a/b);
            nameLength2 = fullName2.length();

            for(int i =0; i<=intAr.length;i++){
                System.out.println(intAr[i]);
            }
        }catch (NullPointerException e) {
            System.out.println("Null Pointer exception is thrown");

            System.out.println(e.getMessage());
        }catch(ArithmeticException e) {
            System.out.println("ArithmeticException is thrown");
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println("Generic/common Exception");
            System.out.println(e.getMessage());
        }
        System.out.println("............................After....................");
    }
}
