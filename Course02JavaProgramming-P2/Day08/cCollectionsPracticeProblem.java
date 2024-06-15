import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee
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
}


public class cCollectionsPracticeProblem 
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

        
        Comparator <Employee> com = new  Comparator<Employee>() 
        {

            @Override
            public int compare(Employee o1, Employee o2) 
            {
                if(o1.getSalary()<o2.getSalary())
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
            }
        };
        Collections.sort(emp,com);
        System.out.println("Employee details after sorting w.r.t salary using comparator!");
        for(Employee e : emp)
        {
            System.out.println(e);
        }

        Collections.sort(emp, (o1,o2)-> o1.getSalary()<o2.getSalary() ? 1:-1);
        System.out.println("Employee details after sorting w.r.t salary using comparator with lambda!");
        for(Employee e : emp)
        {
            System.out.println(e);
        }

    }
}
