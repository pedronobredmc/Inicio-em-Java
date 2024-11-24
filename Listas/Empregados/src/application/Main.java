package src.application;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import src.entities.Employee;

public class Main {
    public static void main(String[] args){
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("How many employees will be registered? ");
            int n = sc.nextInt();
            sc.nextLine();
            List<Employee> list = new ArrayList<>();

            for(int i = 0; i<n; i++){
                System.out.println("Employee #" + (i+1) +":");
                System.out.print("Id: ");
                int id = sc.nextInt();
                sc.nextLine();
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Salary: ");
                double salary = sc.nextDouble();
                sc.nextLine();
                list.add(new Employee(id, name, salary));
            }

            System.out.print("Enter the employee id that will have salary increase: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter percentage: ");
            double percentage = sc.nextDouble();

            Employee emp = findEmployeeById(list, id);
            if (emp != null) {
                emp.setSalary(emp.getSalary() * (1 + percentage / 100));
            } else {
                System.out.println("Employee not found.");
            }

            System.out.println("List of employees:");
            for(Employee teste : list){
                System.out.println(teste);
            }
        }
    }
    public static Employee findEmployeeById(List<Employee> list, int id) {
        for (Employee emp : list) {
            if (emp.getId() == id) {
                return emp;
            }
        }
        return null;
    }
}
