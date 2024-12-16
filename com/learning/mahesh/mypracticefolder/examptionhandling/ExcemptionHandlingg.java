package com.learning.mahesh.mypracticefolder.examptionhandling;

class ExceptionExamples {
    public static void main(String[] args) {
        ExceptionExamples examples = new ExceptionExamples();

        examples.triggerArithmeticException();
        examples.triggerNullPointerException();
        examples.triggerArrayIndexOutOfBoundsException();
    }

    private void triggerArithmeticException() {
        try {
            int a = 10, b = 0;
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }


    private void triggerNullPointerException() {
        try {
            String str = null;
            int length = str.length();
            System.out.println("String length: " + length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }
    }


    private void triggerArrayIndexOutOfBoundsException() {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Number at index 5: " + numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        }
    }
}