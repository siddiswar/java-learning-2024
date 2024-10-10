package com.learning.siri.part2operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        //+ - * / % ++ -- +=

        int a = 10;
        int b = 5;

        int sum = a + b;
        System.out.println(" (a + b) =" + sum);

        int difference = a - b;
        System.out.println("(a - b) =" + difference);

        int product = a * b ;
        System.out.println("Multiplication (a * b) =" + product);

        int quotient = a / b;
        System.out.println("Division (a / b)" + quotient);

        int remainder = a % b;
        System.out.println("Modulus (a % b ) =" + remainder);


        int c = 10;
        c++; //c = c+1
        System.out.println(c);
        c--; //c = c-1
        System.out.println(c);

        int d = 15;
        d += 5; // d = d+10
        System.out.println(d);
        d-= 3; // d =d-4
        System.out.println(d);

        d *= 4; //d=d*4
        System.out.println(d);

        d /=19; //d=d/19
        System.out.println(d);


    }
}
