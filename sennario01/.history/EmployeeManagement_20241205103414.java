import java.util.Scanner;

class Employee {
    private int ID;
    private String name, department;
    private Double salary;

    public void setID(int iD) {
        this.ID = iD;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public Double getSalary() {
        return salary;
    }
}

public class EmployeeManagement {

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        int id;
        double salary;
        String department, name;

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Name: ");
            name = input.nextLine();

            System.out.println("Id: ");
            id = input.nextInt();
            input.nextLine(); // Consume the leftover newline

            System.out.println("Department: ");
            department = input.nextLine();

            System.out.println("Salary: ");
            salary = input.nextDouble();

            // Validation
            while (id <= 0) {
                System.out.println("Enter a valid Id");
                System.out.println("Id: ");
                id = input.nextInt();
                input.nextLine(); // Consume the leftover newline
            }

            while (salary <= 0) {
                System.out.println("Salary must be a positive value");
                System.out.println("Salary: ");
                salary = input.nextDouble();
                input.nextLine(); // Consume the leftover newline
            }

            System.out.println("Data inserted correctly");
        }

        emp1.setName(name);
        emp1.setID(id);
        emp1.setDepartment(department);
        emp1.setSalary(salary);

        System.out.println("Employee Details:");
        System.out.println("ID: " + emp1.getID());
        System.out.println("Name: " + emp1.getName());
        System.out.println("Department: " + emp1.getDepartment());
        System.out.println("Salary: " + emp1.getSalary());
    }
}
