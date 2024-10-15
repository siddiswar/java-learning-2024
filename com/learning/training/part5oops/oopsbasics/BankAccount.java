package com.learning.training.part5oops.oopsbasics;

public class BankAccount {

    //data (variables)
    String name;
    long accountNumber;
    double accountBalance;
    double maxDepositLimit;
    double maxWithdrawLimit;
    double[] lastFiveWithdrawals;


    //constructor
    BankAccount(String givenName, long givenAccountNumber, double givenAccountBalance, double givenMaxDepositLimit, double givenMaxWithdrawLimit) {
        name = givenName;
        accountNumber = givenAccountNumber;
        accountBalance = givenAccountBalance;
        maxDepositLimit = givenMaxDepositLimit;
        maxWithdrawLimit = givenMaxWithdrawLimit;
    }


    //methods
    public void deposit(double depositAmount) {
        if (depositAmount <= 0) {
            System.out.println("Deposits should be more than zero");
        } else if (depositAmount > maxDepositLimit) {
            System.out.println("You are not allowed to deposit more than : " + maxDepositLimit);
        } else {
            accountBalance = accountBalance + depositAmount;
        }
    }

    public void withdraw(double withdrawAmount) {
        if (withdrawAmount <= 0) {
            System.out.println("Withdraw amount should be more than zero");
        } else if (withdrawAmount > maxWithdrawLimit) {
            System.out.println("You are not allowed to withdraw more than : " + maxWithdrawLimit);
        } else if (withdrawAmount > accountBalance) {
            System.out.println("You don't have enough balance");
        } else {
            accountBalance = accountBalance - withdrawAmount;
            lastFiveWithdrawals[4] = withdrawAmount;

        }

    }

    //main method
    public static void main(String[] xyz) {

        //Create an object
        BankAccount siriAccount = new BankAccount("Sirisha Deevi", 111, 2000.0, 50000, 10000.0);

        //access the data (variables)
        System.out.println(siriAccount.name);
        System.out.println(siriAccount.accountNumber);
        System.out.println(siriAccount.accountBalance);
        System.out.println(siriAccount.maxWithdrawLimit);

        siriAccount.deposit(5);
        siriAccount.deposit(35000);
        System.out.println(siriAccount.accountBalance);
        siriAccount.deposit(55000);
        System.out.println(siriAccount.accountBalance);

        siriAccount.withdraw(-2);
        siriAccount.withdraw(95000);
        siriAccount.withdraw(45000);

        System.out.println("---------------------------------------------------------------------");

        BankAccount maheshAccount = new BankAccount("Mahesh K", 112, 10000.0, 75000, 10000.0);

        //access the data (variables)
        System.out.println(maheshAccount.name);
        System.out.println(maheshAccount.accountNumber);
        System.out.println(maheshAccount.accountBalance);
        System.out.println(maheshAccount.maxWithdrawLimit);
    }
}
