package com.learning.mahesh.part1tostaredata.strings;

public class StringConcatination {
    public static void main(String[] args) {

        String A = "Mahesh";
        String B = " ";
        String C = "Reddy";
        String D = " ";
        char E = 'k';
        String fullname = A + B + C + D + E;
        System.out.println(fullname);

        String myfullname = A.concat(C);
        System.out.println(myfullname);

        String Str1 = "concated string is :"  + fullname;
        System.out.println(Str1);

        String Str2 = "second concated string is :" + myfullname;
        System.out.println(myfullname);
    }
}
