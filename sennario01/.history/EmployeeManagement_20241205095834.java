import java.util.Scanner;
class Employee{
    private int ID;
    private String name,department;
    private Double salary;
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
    public void setID(int iD) {
        ID = iD;
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

}
public class EmployeeManagement {

public static void main(String[] args) {
    int id;
    double salary;
    String department,name;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Employee  Id: ");
    id = input.nextInt();
    System.out.println("Name: ");
    name = input.nextLine();
    System.out.println("Department: ");
    department = input.nextLine();
    System.out.println("Salary: ");
    salary = input.nextDouble();

}
}