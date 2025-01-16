package learning.training.part1tostoredata.pojo;

public class ArrayOfPojoExample {

    public static void main(String[] args) {

      //-----------------------------------
       // Array of type Employee
        Employee[] empAr = new Employee[2];
        //-----------------------------------
        Employee emp1 = new Employee();
        emp1.setEmpId(1);
        emp1.setName("Siddu");
        emp1.setPhoneNumber("+44123456");
        emp1.setEmailId("emp1@gmail.com");
        empAr[0] = emp1;
        //-----------------------------------
        Employee emp2 = new Employee();
        emp2.setEmpId(2);
        emp2.setName("Siri");
        emp2.setPhoneNumber("+44223456");
        emp2.setEmailId("emp2@gmail.com");
        empAr[1] = emp2;
        //-----------------------------------

        System.out.println(empAr[0].getEmpId());
        System.out.println(empAr[1].getEmpId());
    }
}
