package com.learning.mahesh.part5oops.oopsbasics;

public class GovtPensionScheme {

    int eligible1;
    int eligible2;
    int eligible3;
    int eligible4;
    int eligible5;


    static int warVeterans = 200;
    static int handicapped = 100;


    public GovtPensionScheme(int below20, int above20Below50, int above50Below60, int above60Below80, int above80) {
        this.eligible1 = below20;
        this.eligible2 = above20Below50;
        this.eligible3 = above50Below60;
        this.eligible4 = above60Below80;
        this.eligible5 = above80;
    }

    public int calculateTotalBeneficiaries() {

        return eligible1 + eligible2 + eligible3 + eligible4 + eligible5 + warVeterans + handicapped;
    }

    public void displaySchemeDetails() {
        System.out.println("Govt Pension Scheme Details:");
        System.out.println("Eligible beneficiaries below 20 years: " + eligible1);
        System.out.println("Eligible beneficiaries above 20 and below 50 years: " + eligible2);
        System.out.println("Eligible beneficiaries above 50 and below 60 years: " + eligible3);
        System.out.println("Eligible beneficiaries above 60 and below 80 years: " + eligible4);
        System.out.println("Eligible beneficiaries above 80 years: " + eligible5);
        System.out.println("War Veterans: " + warVeterans);
        System.out.println("Handicapped beneficiaries: " + handicapped);
        System.out.println("Total beneficiaries: " + calculateTotalBeneficiaries());
    }

    public static void setWarVeterans(int veterans) {
        warVeterans = veterans;
    }

    public static void setHandicapped(int handicappedCount) {
        handicapped = handicappedCount;
    }

    public static void main(String[] args) {
        GovtPensionScheme scheme = new GovtPensionScheme(100, 200, 300, 400, 500);

        scheme.displaySchemeDetails();
        setWarVeterans(250);
        setHandicapped(150);

        scheme.displaySchemeDetails();
    }
}