package learning.training.part1tostoredata.pojo;

public class PojoUsage {
    public static void main(String[] args) {

        Employee emp1 = new Employee();

        emp1.setEmpId(1);
        emp1.setName("Siddu");
        emp1.setPhoneNumber("+44123456");
        emp1.setEmailId("emp1@gmail.com");

        System.out.println(emp1.getEmpId());
        System.out.println(emp1.getName());

    }
}
