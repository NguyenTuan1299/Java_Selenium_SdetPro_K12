package java_lab7_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {

        List<Employee> allEmployees = new ArrayList<>();
        allEmployees.add(new FTEmployee());
        allEmployees.add(new FTEmployee());
        allEmployees.add(new FTEmployee());
        allEmployees.add(new ContractEmployee());
        allEmployees.add(new ContractEmployee());

        int totalSalary = EmployeeController.calculateTotalSalary(allEmployees);
        System.out.println("Total salary is: " + totalSalary);
    }
}
