/*
using ArrayList which is user defined type
Declare a class employee
Declare id, name , salary
Declare constructors, getters,setters and override to string metod 
In main fucntion you need to read, update, delete the data
*/

import java.util.ArrayList;
import java.util.Scanner;

class Employee 
{
    private int id, salary;
    private String name;

    // Constructors

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

public class hCollectionPracticeProblem 
{
    public static void main(String[] args) 
    {
        ArrayList<Employee> emp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice, id, salary,found;
        String name;

        do
        {
            System.out.println("\n----------------------------------\n");
            System.out.println("Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Delete a Particular Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Exit");
            System.out.print("Enter you choice : ");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1 : 
                    System.out.println("Enter the details of employee : id, name, salary");
                    System.out.print("Id : ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name : ");
                    name = sc.nextLine();
                    System.out.print("Salary : ");
                    salary = sc.nextInt();
                    emp.add(new Employee(id,name,salary));
                    System.out.println("Employee added to the collection");
                    break;
                
                case 2:
                    if(emp.isEmpty())
                    {
                        System.out.println("No employees to display!");
                    }
                    else
                    {
                        System.out.println("The employees are : ");
                        for(Employee e: emp)
                        {
                            System.out.println(e);
                        }
                    }
                    break;

                case 3:
                    found = 0;
                    System.out.print("Enter the id of the employee to be deleted : ");
                    int delId = sc.nextInt();
                    for(Employee e : emp)
                    {
                        if(e.getId()==delId)
                        {
                            emp.remove(e);
                            System.out.println("Employee id "+delId+" deleted!");
                            found = 1;
                            break;
                        }
                    }
                    if(found == 0)
                    {
                        System.out.println("Such Employee does not exist!");
                    }
                    break;

                case 4 : 
                    System.out.print("Enter ID of employee to update : ");
                    int upId = sc.nextInt();
                    found = 0;
                    for(Employee e : emp)
                    {
                        if(e.getId()==upId)
                        {
                            System.out.print("Enter New Name : ");
                            sc.nextLine();
                            e.setName(sc.nextLine());
                            System.out.print("Enter New Salary : ");
                            e.setSalary(sc.nextInt());
                            found = 1;
                            break;
                        }
                    }
                    if(found == 0)
                    {
                        System.out.println("Employee ID : "+upId+", Updated!");
                    }
                    break;
                
                case 5 :
                    System.out.println("Exiting the program...");
                    break;
                
                default :
                    System.out.println("Invalid choice! Please try again!");
                
            }
        }
        while(choice!=5);
        sc.close();
    }
}
