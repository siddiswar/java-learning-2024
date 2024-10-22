package com.learning.siri.part5classandobjectbasics;

public class PostalSavingAccount {

    //data(Variables)
    String name;
    long accountNumber;
    double accountBalance;
    double amountDeposit;
    double amountWithDraws;
    double amountTransfers;
    float rateOfInterest;
    int age;


    //Constructor
    PostalSavingAccount(String givenName, long givenAccountNumber, double givenAccountBalance, double givenAmountDeposit, double givenAmountWithDraws, double givenAmountTransfers, float givenRateOfInterest) {
        name = givenName;
        accountNumber = givenAccountNumber;
        accountBalance = givenAccountBalance;
        amountDeposit = givenAmountDeposit;
        amountWithDraws = givenAmountWithDraws;
        amountTransfers = givenAmountTransfers;
        rateOfInterest = givenRateOfInterest;
    }

    //methods
    public void deposit(double amountDeposit) {
        if (amountDeposit <= 0) {
            System.out.println("Deposits should be more than zero");
        } else {
            accountBalance = accountBalance + amountDeposit;
        }
    }


    public void withdrawAmount(double amountWithDraws) {
        if (amountWithDraws <= 0) {
            System.out.println("WithDraw amount should be more than zero");
        } else if (amountWithDraws > accountBalance) {
            System.out.println("you don't have enough balance : " + accountBalance);
        } else {
            accountBalance = accountBalance - amountWithDraws;
        }
    }

    public void transferAmount(double amountTransfers) {
        if (amountTransfers <= 0) {
            System.out.println("Amount transfers should be more than zero");
        } else if (amountTransfers < accountBalance) {
            System.out.println("you are not allowed to transfer more than: " + accountBalance);
        } else {
            accountBalance = accountBalance - amountTransfers;
        }
    }

    public void calculateRateOfInterest() {
        if (age > 68) {
            rateOfInterest = 8.5F;
        } else {
            rateOfInterest = 6.5F;
        }
    }


    //main method
    public static void main(String[] args) {

        //Create an object
        PostalSavingAccount ananyaAccount = new PostalSavingAccount("ananya", 1111, 5000, 5000, 1000, 50, 6.5F);

        // access the data (variables)
        System.out.println(ananyaAccount.name);
        System.out.println(ananyaAccount.accountNumber);
        System.out.println(ananyaAccount.accountBalance);
        System.out.println(ananyaAccount.amountDeposit);
        System.out.println(ananyaAccount.amountWithDraws);
        System.out.println(ananyaAccount.amountTransfers);
        System.out.println(ananyaAccount.rateOfInterest);

        ananyaAccount.deposit(-4);
        ananyaAccount.deposit(10000);
        System.out.println(ananyaAccount.accountBalance);
        ananyaAccount.deposit(45000);
        System.out.println(ananyaAccount.accountBalance);

    }
}

