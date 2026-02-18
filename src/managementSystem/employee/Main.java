package managementSystem.employee;

public class Main {

    public  static void main(String[] args) {

        EmployeeService service = new EmployeeService();

        service.addEmployee(new Employee(1, "Ana", 3000));
        service.addEmployee(new Employee(2, "Carlos", 4500));

        System.out.println("=== Employee List ===");
        service.listEmployees();

        System.out.println("\n=== Find Employee ID 1 ===");
        Employee found = service.findById(1);
        if (found != null) {
            found.display();
        }
    }
}