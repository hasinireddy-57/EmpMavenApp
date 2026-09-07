package employee;
public class App{
    public static void main(String[] args){
        String name = "Hasini";
        int employeeId = 101;
        int salary = 90000;
        System.out.println("Employee Management System");
        System.out.println("--------------------------");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
        if (salary >= 30000) {
            System.out.println("Status: Active");
        } else {
            System.out.println("Status: Inactive");
        }
    }
}