package com.learning.siri.part5classandobjectbasics.variabletypes;

public class Employee {

    //Member Variables (or) Instance Variable
    // These are global in nature
    // Global Variables can be accessed by all methods in the class
    private long empId;
    private String empName;
    private int yrsOfExperience;
    private double salary;
    private boolean hasFinishedProbation;
    public static String ceoName = "Ratan Tata";
    private static final String COMPANY_NAME = "TCS";


    public Employee(long empId, String empName, int yrsOfExperience, double salary, boolean hasFinishedProbation) {
        this.empId = empId;
        this.empName = empName;
        this.yrsOfExperience = yrsOfExperience;
        this.salary = salary;
        this.hasFinishedProbation = hasFinishedProbation;
    }

    public int getNoticePeriodInMonths() {
        int noticeMonths; // This is Local variable
        // Local Varibales can only be accessed inside the method where they are declared
        if (hasFinishedProbation) {
            noticeMonths = 3;
        } else {
            noticeMonths = 1;
        }
        System.out.println("Notice Period In Monthgs :" + noticeMonths);
        return noticeMonths;
    }

    public double calculateBonusPercentage() {
        double bonusPercentage = 0;  // Local variable
        if (yrsOfExperience > 1) {
            bonusPercentage = 10;
        }
        System.out.println("Bonus Percentage :" + bonusPercentage);
        return bonusPercentage;
    }

    public double calculateBonusAmount() {
        double percentBonus;        // Local variable
        percentBonus = calculateBonusPercentage();
        double bonusAmount = salary * percentBonus / 100;
        System.out.println("Bonus Amount :" + bonusAmount);
        return bonusAmount;
    }

    public void printCompanyDetails() {
        System.out.println(ceoName);
        System.out.println(COMPANY_NAME);
    }

    public void updateCeoName() {
        ceoName = "Noel Tata";
    }

    public void updateCompanyName() {
//        COMPANY_NAME = "some new name;";
    }


    public static void main(String[] args) {

        System.out.println(Employee.ceoName);
        System.out.println(Employee.COMPANY_NAME);

        Employee siri = new Employee(1, "Siri", 3, 50000, true);
        siri.getNoticePeriodInMonths();
        siri.calculateBonusAmount();
        System.out.println(siri.empId);


        System.out.println("--------------------------------------------------");
        Employee mahesh = new Employee(2, "Mahesh", 1, 55000, false);
        mahesh.getNoticePeriodInMonths();
        mahesh.calculateBonusAmount();

        System.out.println("--------------------------------------------------");
        Employee poojitha = new Employee(3, "poojith B", 6, 65000, true);
        poojitha.getNoticePeriodInMonths();
        poojitha.calculateBonusAmount();
    }
}
