/*
Write a Java program to create a class called Employee with methods called showEmployee() and getSalary(). Create a subclass called HRManager that overrides the getSalary()
employee
id
name
salary
hr
*/

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void showEmployee() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: Rs." + salary);
    }

    public double getSalary() {
        return salary;
    }
}


class HRManager extends Employee {
    private double bonus;

    public HRManager(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }
}

public class bEmployeeSalOverride {
    public static void main(String[] args) {
        Employee emp1 = new Employee(123, "ABCD", 50000);
        HRManager emp2 = new HRManager(456, "EFGH", 60000, 10000);

        emp1.showEmployee();
        emp2.showEmployee();

        System.out.println("Employee 1 salary: Rs." + emp1.getSalary());
        System.out.println("Employee 2 salary: Rs." + emp2.getSalary());
    }
}
