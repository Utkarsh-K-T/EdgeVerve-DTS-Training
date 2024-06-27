package com.employee.dao;

import java.sql.SQLException;
import java.util.List;
import com.employee.model.Employee;

public interface EmployeeDao 
{
	public void createEmployeeTable() throws SQLException;
    public void addEmployee(Employee e) throws SQLException;
    public List<Employee> showAllEmployees() throws SQLException;
    public List<Employee> showEmployeesSortedByDepartment() throws SQLException;
    public void updateEmployee(Employee e) throws SQLException;
    public void deleteEmployee(int id) throws SQLException;
    public Employee findEmployeeById(int id) throws SQLException;
    public String findDepartmentWithMostEmployees() throws SQLException;
    public String findHighestSalaryEmployeeName() throws SQLException;
    public double findHighestSalary() throws SQLException;
    public void connect() throws SQLException;
}