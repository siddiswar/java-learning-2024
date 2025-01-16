package learning.training.part1tostoredata.pojo;

import java.util.ArrayList;
import java.util.List;

public class ListOfPojoExample {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        //-----------------------------------
        Employee emp1 = new Employee();
        emp1.setEmpId(1);
        emp1.setName("Siddu");
        emp1.setPhoneNumber("+44123456");
        emp1.setEmailId("emp1@gmail.com");
        employeeList.add(emp1);
        //-----------------------------------
        Employee emp2 = new Employee();
        emp2.setEmpId(2);
        emp2.setName("Siri");
        emp2.setPhoneNumber("+44223456");
        emp2.setEmailId("emp2@gmail.com");
        employeeList.add(emp2);
        //-----------------------------------
        System.out.println(employeeList.get(0).getEmpId());
        System.out.println(employeeList.get(1).getEmpId());
    }
}
