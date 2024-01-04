package practice_lab7_1;

import java.util.List;

public class EmployeeController {
    public static int getTotalSalary(List<Employee> employees){
        int totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
}
