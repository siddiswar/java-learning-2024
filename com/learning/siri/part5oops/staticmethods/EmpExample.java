package com.learning.siri.part5oops.staticmethods;

public class EmpExample {

    private long empId;
    public static String CeoName = "Ratan Tata";

    //Non-static methods can access both static and non-static variables
    public void printEmpIdNonStatic() {System.out.println(empId);}

    public void printCeoNameNonStatic() {System.out.println(CeoName);}


    //static methods can only access static variables
    public static void printEmpIdStatic() {
        // System.out.println(empId);
        // This will throw the error "Non-static field 'empId' cannot be referenced from a static context"
    }

    public static void printCeoNameStatic() {
        System.out.println(CeoName);
    }

    //a non-static method can access both static and non-static variables
    //a static method can access only static variables

    //Practical example

    private static String dbUserName;
    private static String dbPassword;

    public static void establishDbConnection() {
        System.out.println("Establishing db Connections using dbUserName and dbPassword :" + dbUserName + " : " + dbPassword);
    }

    public void someNonStaticMethod(){
        establishDbConnection(); //accessed directly
    }

    public static void someStaticMethod(){
        establishDbConnection(); //accessed directly
    }
}


