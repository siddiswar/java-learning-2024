package com.learning.training.part5classandobjectbasics.gettersandsetters;

public class BankAccount {

    //Member Variables
    private long accountNumber;
    private double accountBalance;

    //Constructor
    public BankAccount(long accountNumber, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
    }

    //Member Method
    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    //by not having the setAccountBalance() setting method,
    // BankAccount class is able to restrict the other classes to completely
    // depend on deposutIntoAccount() and withdrawFromAccount() methods

//    public void setAccountBalance(double accountBalance) {
//        this.accountBalance = accountBalance;
//    }

    public void depositIntoAccount(double amount) {
        if (amount > 0) {
            accountBalance = accountBalance + amount;
        } else {
            System.out.println(" amount should not be negative");
        }
    }

    public void withdrawFromAccount(double withdrawAmount) {
        if (withdrawAmount < accountBalance) {
            accountBalance = accountBalance - withdrawAmount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

}
