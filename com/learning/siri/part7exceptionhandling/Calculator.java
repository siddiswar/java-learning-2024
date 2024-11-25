package com.learning.siri.part7exceptionhandling;

public class Calculator {

        public int sum(int l, int m) {
            return l + m;
        }

        public int multiply(int l, int m) {
            return l * m;
        }

        public int divide(int l, int m) {
            return l / m;
        }

        public static void main(String[] args) {
            int a = 6;
            int b = 0;

            Calculator calculator = new Calculator();

            int sumValue = calculator.sum(a, b);
            System.out.println("Sum :" + sumValue);

            int divValue;

            try {
                divValue = calculator.divide(a, b);
            } catch (Exception e) {
                System.out.println("Divide by zero Division exception occurred  ");
                divValue = 0;
                System.out.println(e.getMessage());
            }
            System.out.println("Division :" + divValue);

            int mulValue = calculator.multiply(a, b);

            System.out.println("Multiplication :" + mulValue);

        }


    }

