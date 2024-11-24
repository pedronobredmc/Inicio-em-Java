package src.entities;

public class Employee {
    private final int id;
    private final String name;
    private double Salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        Salary = salary;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", name='" + name  +
                ", Salary=" + Salary +
                '}';
    }
}
