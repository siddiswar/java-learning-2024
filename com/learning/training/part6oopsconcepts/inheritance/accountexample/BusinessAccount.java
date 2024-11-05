package com.learning.training.part6oopsconcepts.inheritance.accountexample;

public class BusinessAccount extends Account {

    //Data (or) Variables
    public String companyName;

    public BusinessAccount(String accountNumber, String branch, double accountBalance,String companyName) {

        super(accountNumber,branch,accountBalance);
        this.companyName = companyName;
    }

    public void calculateGst() {
    }

    public void fileBusinessIncomeTax() {

    };
}
