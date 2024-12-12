package com.learning.mahesh.datastorage.maheshstringspractice;

public class StringsConcatenation {
    public static void main(String[] args) {

    String employee1 = "Alice";
    String employee2 = "Bob";
    String employee3 = "Charlie";


    String result1 = employee1 + ", " + employee2 + ", " + employee3;
    System.out.println("Using + operator: " + result1);


    String result2 = employee1.concat(", ").concat(employee2).concat(", ").concat(employee3);
    System.out.println("Using concat() method: " + result2);

    // 3. Using StringBuilder
    StringBuilder sb = new StringBuilder();
    sb.append(employee1).append(", ").append(employee2).append(", ").append(employee3);
    System.out.println("Using StringBuilder: " + sb.toString());


    String result4 = String.join(", ", employee1, employee2, employee3);
    System.out.println("Using String.join(): " + result4);


    String result5 = String.format("%s, %s, %s", employee1, employee2, employee3);
    System.out.println("Using String.format(): " + result5);


    String result6 = java.util.stream.Stream.of(employee1, employee2, employee3)
            .reduce((e1, e2) -> e1 + ", " + e2)
            .orElse("No employees");
    System.out.println("Using Stream API: " + result6);
}
}
