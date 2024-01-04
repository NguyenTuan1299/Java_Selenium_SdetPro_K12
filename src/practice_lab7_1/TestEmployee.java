package practice_lab7_1;

import java.util.ArrayList;
import java.util.List;

public class TestEmployee {
    public static void main(String[] args) {
        List<Employee> employee = new ArrayList<>();
        employee.add(new FTEmployee());
        employee.add(new FTEmployee());
        employee.add(new FTEmployee());
        employee.add(new ContractEmployee());
        employee.add(new ContractEmployee());

        int totalSalary = EmployeeController.getTotalSalary(employee);
        System.out.println("Total salary is: " + totalSalary);
    }
}
