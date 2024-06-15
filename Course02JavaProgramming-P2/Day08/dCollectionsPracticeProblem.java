import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable <Employee>
{
    protected int id, salary;
    protected String name;
    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }

    @Override
    public int compareTo(Employee o) 
    {
        return this.salary < o.salary ? 1 : -1;
    }
}



public class dCollectionsPracticeProblem 
{
    public static void main(String[] args) 
    {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(1,"Ram",30000));
        emp.add(new Employee(1,"Mike",20000));
        emp.add(new Employee(1,"Ram",80000));
        emp.add(new Employee(1,"Ram",50000));

        System.out.println("Employee details before sorting!");
        for(Employee e : emp)
        {
            System.out.println(e);
        }

        Collections.sort(emp);
        System.out.println("Employee details after sorting w.r.t salary using comparable!");
        for(Employee e : emp)
        {
            System.out.println(e);
        }
    }
}
