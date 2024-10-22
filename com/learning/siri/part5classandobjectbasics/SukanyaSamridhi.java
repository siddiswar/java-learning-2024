package com.learning.siri.part5classandobjectbasics;

public class SukanyaSamridhi {

    //data(Variables)
    String name ;
    long accountNumber;
    int accountHolderAge;
    double amountDeposit;
    double amountWithDraw;
    int preMatureClosure;
    float rateOfInterest;


    //Constructor
    SukanyaSamridhi(String givenName, long givenAccountNumber, int givenAccountHolderAge, double givenAmountDeposit, double givenAmountWithDraws, int givenPreMatureClosure, float givenRateOfInterest){
        name = givenName;
        accountNumber = givenAccountNumber;
        accountHolderAge = givenAccountHolderAge;
        amountDeposit = givenAmountDeposit;
        amountWithDraw = givenAmountWithDraws;
        preMatureClosure = givenPreMatureClosure;
        rateOfInterest =  givenRateOfInterest;

    }

    //methods
    public void accountHolderAge(int accountHolderAge){
        if(accountHolderAge <= 10){
            System.out.println("Applicable for sukanya samridhi");
        } else  {
            System.out.println("Not applicable for sukanya samridhi");
        }

        }

        public void preMatureClosure(int preMatureClosure){
        if(preMatureClosure >= 18){
            System.out.println("Applicable for prematureclosure");
        }else{
            System.out.println("Not applicable");
        }

    }

    //main method
    public static void main(String[] args){


        // Create an object
        SukanyaSamridhi ananyaAccount = new SukanyaSamridhi( "Ananya",1111 ,10,25000,100,18,7.7F);

        //acess the data(variables)
        System.out.println(ananyaAccount.name);
        System.out.println(ananyaAccount.accountNumber);
        System.out.println(ananyaAccount.accountHolderAge);
        System.out.println(ananyaAccount.preMatureClosure);
        System.out.println(ananyaAccount.rateOfInterest);

        ananyaAccount.accountHolderAge( 10 );


    }
}
