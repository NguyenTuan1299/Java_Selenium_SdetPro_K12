package java_lab7_1;

import java.util.List;

public class EmployeeController {

    public static int calculateTotalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

}
