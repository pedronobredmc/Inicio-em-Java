package POO.Empregado.application;
import java.util.Scanner;

import POO.Empregado.entities.Employee;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee empregado = new Employee();
        System.out.print("Enter employee name: ");
        empregado.name = sc.nextLine();
        System.out.print("Enter employee gross salary: ");
        empregado.grossSalary = sc.nextDouble();
        System.out.print("Enter employee tax: ");
        empregado.tax = sc.nextDouble();
        System.out.println();
        System.out.println(empregado);
        System.out.println();

        System.out.print("Which percentage to increase salary ? ");
        empregado.increaseSalary(sc.nextDouble());

        System.out.println();
        System.out.println(empregado);

        sc.close();
    }
}
