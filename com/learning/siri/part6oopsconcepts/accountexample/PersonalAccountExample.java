package com.learning.siri.part6oopsconcepts.accountexample;


public class PersonalAccountExample extends Account {

    //Data (or) Variables


    public String accountHolderName;

    // child class constructor
    public PersonalAccountExample ( String accountNumber,String branch, double accountBalance,String accountHolderName){
        super(accountNumber,branch,accountBalance);
        this.accountHolderName = accountHolderName;

    }
    public void filePersonalIncomeTax(){}


}
