package com.employee.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.employee.dao.EmployeeDaoImpl;
import com.employee.model.Employee;

public class EmployeeService 
{

    public static void main(String[] args) throws SQLException 
    {
        Scanner sc = new Scanner(System.in);
        boolean authenticated = false;

        while (!authenticated) 
        {
        	System.out.println("-----------------------------------------------");
        	System.out.println("Login/Signup Menu");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            System.out.println("-----------------------------------------------");
            switch (choice) 
            {
                case 1:
                    Authenticator.register();
                    break;
                case 2:
                    authenticated = Authenticator.authenticate();
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }

        EmployeeDaoImpl dao = new EmployeeDaoImpl();
        int choice, employeeId;
        String employeeName, employeeDepartment;
        double employeeSalary;
        do 
        {
        	System.out.println("-----------------------------------------------");
            System.out.println("Menu");
            System.out.println("1. Create Employee Table");
            System.out.println("2. Add New Employee");
            System.out.println("3. Show All Employees");
            System.out.println("4. Show Employees Sorted by Department");
            System.out.println("5. Update Employee");
            System.out.println("6. Delete Employee");
            System.out.println("7. Find Employee By ID");
            System.out.println("8. Find Department with Most Employees");
            System.out.println("9. Find Highest Salary Employee Name and Salary");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("-----------------------------------------------");

            switch (choice)
            {
            
                case 1:
                    dao.connect();
                    dao.createEmployeeTable();
                    break;

                case 2:
                    dao.connect();
                    System.out.print("Enter Employee ID: ");
                    employeeId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Employee Name: ");
                    employeeName = sc.nextLine();
                    System.out.print("Enter Employee Department: ");
                    employeeDepartment = sc.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    employeeSalary = sc.nextDouble();
                    sc.nextLine();
                    Employee employee = new Employee(employeeId, employeeName, employeeDepartment, employeeSalary);
                    dao.addEmployee(employee);
                    break;

                case 3:
                    dao.connect();
                    List<Employee> employees = dao.showAllEmployees();
                    if (employees.isEmpty()) 
                    {
                        System.out.println("No entries found in the employee table");
                    } 
                    else 
                    {
                        for (Employee e : employees) 
                        {
                            System.out.println(e);
                        }
                    }
                    break;

                case 4:
                    dao.connect();
                    List<Employee> sortedEmployees = dao.showEmployeesSortedByDepartment();
                    if (sortedEmployees.isEmpty()) 
                    {
                        System.out.println("No entries found in the employee table");
                    } 
                    else 
                    {
                        for (Employee e : sortedEmployees) 
                        {
                            System.out.println(e);
                        }
                    }
                    break;

                case 5:
                    dao.connect();
                    System.out.print("Enter Employee ID to update: ");
                    int updateEmployeeId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Employee Name: ");
                    String newEmployeeName = sc.nextLine();
                    System.out.print("Enter New Employee Department: ");
                    String newEmployeeDepartment = sc.nextLine();
                    System.out.print("Enter New Employee Salary: ");
                    double newEmployeeSalary = sc.nextDouble();
                    sc.nextLine();
                    Employee updatedEmployee = new Employee(updateEmployeeId, newEmployeeName, newEmployeeDepartment, newEmployeeSalary);
                    dao.updateEmployee(updatedEmployee);
                    break;

                case 6:
                    dao.connect();
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteEmployeeId = sc.nextInt();
                    sc.nextLine();
                    dao.deleteEmployee(deleteEmployeeId);
                    break;

                case 7:
                    dao.connect();
                    System.out.print("Enter Employee ID to find: ");
                    int findEmployeeId = sc.nextInt();
                    sc.nextLine();
                    Employee foundEmployee = dao.findEmployeeById(findEmployeeId);
                    System.out.println(foundEmployee != null ? foundEmployee : "Employee not found");
                    break;

                case 8:
                    dao.connect();
                    String departmentWithMostEmployees = dao.findDepartmentWithMostEmployees();
                    System.out.println("Department with most employees: " + departmentWithMostEmployees);
                    break;

                case 9:
                    dao.connect();
                    String highestSalaryEmployeeName = dao.findHighestSalaryEmployeeName();
                    double highestSalary = dao.findHighestSalary();
                    System.out.println("Highest Salary Employee: " + highestSalaryEmployeeName + " with salary Rs." + highestSalary);
                    break;

                case 10:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        } 
        while (choice != 10);

        sc.close();
    }
}
