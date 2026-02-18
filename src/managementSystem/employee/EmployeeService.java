package managementSystem.employee;

import java.util.ArrayList;
import  java.util.List;

public class EmployeeService {

    private  List<Employee> employees = new ArrayList<>();

    public void  addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void listEmployees() {
        for (Employee employee : employees) {
            employee.display();
        }
    }

    public Employee findById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return  employee;
            }
        }
        return null;
    }

    public void removeEmployee(int id) {
        employees.removeIf(employee -> employee.getId() == id);
    }
}