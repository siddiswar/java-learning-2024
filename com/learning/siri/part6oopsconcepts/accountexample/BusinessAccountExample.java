package com.learning.siri.part6oopsconcepts.accountexample;

public class BusinessAccountExample extends Account {

    //Data (or) Variables
    public String companyName;

    public BusinessAccountExample(String accountNumber, String branch, double accountBalance, String CompanyName){

        super(accountNumber,branch,accountBalance);
        this.companyName = companyName;

    }

    public void calculateGst(){

    }

    public void fileBusinessIncomeTax(){

    }
}
