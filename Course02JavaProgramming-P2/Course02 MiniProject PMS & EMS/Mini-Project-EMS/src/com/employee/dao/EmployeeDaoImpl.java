package com.employee.dao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.employee.model.Employee;

public class EmployeeDaoImpl implements EmployeeDao 
{
    private Connection con;

    @Override
    public void createEmployeeTable() throws SQLException 
    {
        Statement st = con.createStatement();
        String sql = "CREATE TABLE IF NOT EXISTS EMPLOYEES (id INT PRIMARY KEY, name VARCHAR(50), department VARCHAR(50), salary DOUBLE)";
        st.execute(sql);
        System.out.println("Employee table created!");
        st.close();
    }

    @Override
    public void addEmployee(Employee e) throws SQLException 
    {
        PreparedStatement pst = con.prepareStatement("INSERT INTO EMPLOYEES VALUES (?,?,?,?)");
        pst.setInt(1, e.getId());
        pst.setString(2, e.getName());
        pst.setString(3, e.getDepartment());
        pst.setDouble(4, e.getSalary());
        int count = pst.executeUpdate();
        System.out.println(count + " record added to employees table successfully!");
        pst.close();
    }

    @Override
    public List<Employee> showAllEmployees() throws SQLException 
    {
        Statement st = con.createStatement();
        List<Employee> employees = new ArrayList<>();
        ResultSet rs = st.executeQuery("SELECT * FROM EMPLOYEES");
        while (rs.next()) 
        {
            employees.add(new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
        }
        rs.close();
        st.close();
        return employees;
    }

    @Override
    public List<Employee> showEmployeesSortedByDepartment() throws SQLException 
    {
        Statement st = con.createStatement();
        List<Employee> employees = new ArrayList<>();
        ResultSet rs = st.executeQuery("SELECT * FROM EMPLOYEES ORDER BY department");
        while (rs.next()) 
        {
            employees.add(new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4)));
        }
        rs.close();
        st.close();
        return employees;
    }

    @Override
    public void updateEmployee(Employee e) throws SQLException 
    {
        PreparedStatement pst = con.prepareStatement("UPDATE EMPLOYEES SET name = ?, department = ?, salary = ? WHERE id = ?");
        pst.setString(1, e.getName());
        pst.setString(2, e.getDepartment());
        pst.setDouble(3, e.getSalary());
        pst.setInt(4, e.getId());
        int cnt = pst.executeUpdate();
        System.out.println(cnt + " record updated successfully!");
        pst.close();
    }

    @Override
    public void deleteEmployee(int id) throws SQLException 
    {
        PreparedStatement pst = con.prepareStatement("DELETE FROM EMPLOYEES WHERE id = ?");
        pst.setInt(1, id);
        int cnt = pst.executeUpdate();
        System.out.println(cnt + " record deleted successfully!");
        pst.close();
    }

    @Override
    public Employee findEmployeeById(int id) throws SQLException 
    {
        PreparedStatement pst = con.prepareStatement("SELECT * FROM EMPLOYEES WHERE id = ?");
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        Employee employee = null;
        if (rs.next()) 
        {
            employee = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
        }
        rs.close();
        pst.close();
        return employee;
    }

    @Override
    public String findDepartmentWithMostEmployees() throws SQLException 
    {
        CallableStatement cs = con.prepareCall("{CALL findDepartmentWithMostEmployees()}");
        ResultSet rs = cs.executeQuery();
        String department = null;
        if (rs.next())
        {
            department = rs.getString(1);
        }
        rs.close();
        cs.close();
        return department;
    }

    @Override
    public String findHighestSalaryEmployeeName() throws SQLException
    {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT findHighestSalaryEmployeeName()");
        rs.next();
        String name = rs.getString(1);
        rs.close();
        st.close();
        return name;
    }

    @Override
    public double findHighestSalary() throws SQLException 
    {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT findHighestSalary()");
        rs.next();
        double salary = rs.getDouble(1);
        rs.close();
        st.close();
        return salary;
    }

    @Override
    public void connect() throws SQLException 
    {
        String url = "jdbc:mysql://localhost:3306/employeedb";
        String user = "root";
        String pwd = "Mysql@369#pass";
        con = DriverManager.getConnection(url, user, pwd);
        System.out.println("Connected to the database!");
    }
}