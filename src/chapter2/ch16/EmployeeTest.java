package chapter2.ch16;

public class EmployeeTest {

    public static void main(String[] args) {

        System.out.println(Employee.getSerialNum());

        Employee employeePark = new Employee();
        employeePark.setEmployeeName("park");

        System.out.println(employeePark.getEmployeeName()+"님의 사번은 " + employeePark.getEmployeeId() + "입니다.");

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("kim");

        System.out.println(employeeKim.getEmployeeName()+"님의 사번은 " + employeeKim.getEmployeeId() + "입니다.");
    }
}
