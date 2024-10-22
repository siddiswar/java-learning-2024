package com.learning.training.part5classandobjectbasics.gettersandsetters;

public class BankAccountCaller {
    public static void main(String[] args) {
        BankAccount siriAccount = new BankAccount(111, 9876);

        System.out.println(siriAccount.getAccountNumber());
        System.out.println(siriAccount.getAccountBalance());

        siriAccount.depositIntoAccount(234.5);
        System.out.println(siriAccount.getAccountBalance());

        siriAccount.withdrawFromAccount(456);
        System.out.println(siriAccount.getAccountBalance());


    }
}
