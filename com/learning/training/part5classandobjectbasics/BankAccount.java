package com.learning.training.part5classandobjectbasics;

public class BankAccount {

    //data (variables)
    String name;
    long accountNumber;
    double accountBalance;
    double maxDepositLimit;
    double maxWithdrawLimit;
    double[] lastFiveWithdrawals;


    //Constructor
    BankAccount(String givenName, long givenAccountNumber, double givenAccountBalance, double givenMaxDepositLimit, double givenMaxWithdrawLimit){
        name = givenName;
        accountNumber = givenAccountNumber;
        accountBalance = givenAccountBalance;
        maxDepositLimit =givenMaxDepositLimit;
        maxWithdrawLimit = givenMaxWithdrawLimit;

    }

    //methods
    public void deposit (double depositAmount) {
        if(depositAmount <=0) {
            System.out.println("Deposits should be more than zero");
        } else if (depositAmount > maxDepositLimit) {
            System.out.println("You are not allowed to deposit more than: "+ maxDepositLimit);
        }else{
            accountBalance = accountBalance + depositAmount;
        }
    }

    public  void withdraw(double withdrawAmount) {
        if (withdrawAmount <= 0) {
            System.out.println("withdraw amount should be more than zero");
        } else if (withdrawAmount> maxWithdrawLimit) {
            System.out.println("you are not allowed to withdraw more than : " + maxWithdrawLimit);
        } else if (withdrawAmount > accountBalance) {
            System.out.println("you dont have enough balance");
        }else{
            accountBalance = accountBalance-withdrawAmount;
            lastFiveWithdrawals[4]=withdrawAmount;
        }
    }

    //main method
    public static void main(String[] args) {

        // Create an object
        BankAccount SiriAccount = new BankAccount( "Sirisha Deevi", 111,2000.0, 50000,10000);

        //access the data (variables)
        System.out.println(SiriAccount.name);
        System.out.println(SiriAccount.accountNumber);
        System.out.println(SiriAccount.accountBalance);
        System.out.println(SiriAccount.maxWithdrawLimit);

        SiriAccount.deposit( -2);
        SiriAccount.deposit( 35000);
        System.out.println(SiriAccount.accountBalance);
        SiriAccount.deposit( 55000);
        System.out.println(SiriAccount.accountBalance);

        SiriAccount.withdraw( -2);
        SiriAccount.withdraw( 95000);
        SiriAccount.withdraw(( 45000));


        System.out.println("-------------------------------------------------------------------");
    }
}