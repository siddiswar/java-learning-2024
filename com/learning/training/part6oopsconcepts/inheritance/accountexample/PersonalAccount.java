package com.learning.training.part6oopsconcepts.inheritance.accountexample;

public class PersonalAccount extends Account {
    //Data (or) Variables
    public String accountHolderName;

    //child class constructor
    public PersonalAccount(String accountNumber, String branch, double accountBalance, String accountHolderName) {
        //constructor of parent class is called using 'super' as shown below
        //super should always be the first line of this constructor
        super(accountNumber, branch, accountBalance);
        this.accountHolderName = accountHolderName;
    }

    public void filePersonalIncomeTax(){
    }
}
