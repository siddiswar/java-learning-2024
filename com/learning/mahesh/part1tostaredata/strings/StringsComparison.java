package com.learning.mahesh.part1tostaredata.strings;

public class StringsComparison {

    public static void main(String[] args) {
        String firstname = "Mahesh";
        String secondname = "Kanuparthi";
        String thirdname = "Mahesh";

        if (firstname.equals(secondname)) {
            System.out.println("first name equals second name");
        }else{
            System.out.println("first name doest equals second name");
        }
        if (firstname.equals(secondname) ){
            System.out.println("both the strings are not same");
        }else if (secondname.equals(thirdname)){
            System.out.println("both the strings are not same");
        }else if (firstname.equals(thirdname)){
            System.out.println("both the strings are same");
        }





    }
}
