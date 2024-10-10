package com.learning.mahesh.part3conditionalstatements;

public class Switchcase {
    public static void main(String[] args) {
        double sagarPercentage = 70.0;
        double sanjeevPercentage = 78.0;
        double sureshPercentage = 89.0;
        double rameshPercentage = 90.0;

        String leader = "";
        {

        if (sagarPercentage > sanjeevPercentage && sagarPercentage > sureshPercentage && sagarPercentage > rameshPercentage) {
            leader = "Sagar";
        } else if (sanjeevPercentage > sagarPercentage && sanjeevPercentage > sureshPercentage && sanjeevPercentage > rameshPercentage) {
            leader = "Sanjeev";
        } else if (sureshPercentage > rameshPercentage && sureshPercentage > sagarPercentage && sureshPercentage > sanjeevPercentage) {
            leader = "Suresh";
        } else {
            leader = "Ramesh";
        }

        switch (leader) {

            case "Sagar":
                System.out.println("The student leader is: Sagar");
                System.out.println("Sagar secured " + sagarPercentage + "% marks.");
                break;

            case "Sanjeev":
                System.out.println("The student leader is: Sanjeev");
                System.out.println("Sanjeev secured " + sanjeevPercentage + "% marks.");
                break;

            case "Suresh":
                System.out.println("The student leader is: Suresh");
                System.out.println("Suresh secured " + sureshPercentage + "% marks.");
                break;

            case "Ramesh":
                System.out.println("The student leader is: Ramesh");
                System.out.println("Ramesh secured " + rameshPercentage + "% marks.");
                break;

            default:
                System.out.println("No valid leader found.");
                break;
        }
    }
    }

}

