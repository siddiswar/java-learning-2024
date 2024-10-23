package com.learning.mahesh.part5oops;


   class Pension {
       //(private instace variable)
       private int age;

       public Pension(int age) {
         this.age = age;
      }

       public int calculatePension() {
        if (age < 20) {
            return 100;
        } else if (age >= 20 && age < 50) {
            return 200;
        } else if (age >= 50 && age < 60) {
            return 300;
        } else if (age >= 60 && age < 80) {
            return 400;
        } else if (age >= 80) {
            return 500;
        } else {
            return 0;
        }
     }

      public int getAge() {
        return age;
    }

     public void setAge(int age) {
        this.age = age;
     }
  }

   public class Main {
      public static void main(String[] args) {

        Pension person1 = new Pension(55);
        System.out.println("Pension for age 55: £" + person1.calculatePension());
        Pension person2 = new Pension(65);
        System.out.println("Pension for age 65: £" + person2.calculatePension());
        Pension person3 = new Pension(15);
        System.out.println("Pension for age 15: £" + person3.calculatePension());


    }
}