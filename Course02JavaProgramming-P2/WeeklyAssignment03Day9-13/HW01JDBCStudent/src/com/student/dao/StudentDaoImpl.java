package com.student.dao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.student.model.Student;
public class StudentDaoImpl implements StudentDao 
{
    private Connection con;
    @Override
    public void createStudentTable() throws SQLException 
    {
        Statement st = con.createStatement();
        String sql = "CREATE TABLE IF NOT EXISTS STUDENTS (id INT PRIMARY KEY, name VARCHAR(30), course VARCHAR(30), totalMarks INT)";
        st.execute(sql);
        System.out.println("Student table created!");
        st.close();
    }
    @Override
    public void addStudent(Student s) throws SQLException 
    {
        PreparedStatement pst = con.prepareStatement("INSERT INTO STUDENTS VALUES (?,?,?,?)");
        pst.setInt(1, s.getId());
        pst.setString(2, s.getName());
        pst.setString(3, s.getCourse());
        pst.setInt(4, s.getTotalMarks());
        int count = pst.executeUpdate();
        System.out.println(count + " record added to students table successfully!");
        pst.close();
    }
    @Override
    public List<Student> showAllStudents() throws SQLException 
    {
        Statement st = con.createStatement();
        List<Student> students = new ArrayList<>();
        ResultSet rs = st.executeQuery("SELECT * FROM STUDENTS");
        while (rs.next()) 
        {
            students.add(new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4)));
        }
        rs.close();
        st.close();
        return students;
    }
    @Override
    public void connect() throws SQLException 
    {
        String url = "jdbc:mysql://localhost:3306/studentdb";
        String user = "root";
        String pwd = "Mysql@369#pass";
        con = DriverManager.getConnection(url, user, pwd);
        System.out.println("Connected to the database!");
    }
    @Override
    public void updateStudent(Student s) throws SQLException 
    {
        PreparedStatement pst = con.prepareStatement("UPDATE STUDENTS SET name = ?, course = ?, totalMarks = ? WHERE id = ?");
        pst.setString(1, s.getName());
        pst.setString(2, s.getCourse());
        pst.setInt(3, s.getTotalMarks());
        pst.setInt(4, s.getId());
        int cnt = pst.executeUpdate();
        System.out.println(cnt+" record updated successfully!");
        pst.close();
    }
    @Override
    public void deleteStudent(int id) throws SQLException 
    {
        PreparedStatement pst = con.prepareStatement("DELETE FROM STUDENTS WHERE id = ?");
        pst.setInt(1, id);
        int cnt = pst.executeUpdate();
        System.out.println(cnt+" record deleted successfully!");
        pst.close();
    }
    @Override
    public Student findStudentByIdUsingProc(int id) throws SQLException 
    {
        CallableStatement cs = con.prepareCall("{CALL findStudentById(?)}");
        cs.setInt(1, id);
        ResultSet rs = cs.executeQuery();
        Student student = null;
        if (rs.next()) 
        {
            student = new Student(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
        }
        rs.close();
        cs.close();
        return student;
    }
    @Override
    public int findTopperMarksUsingFunc() throws SQLException 
    {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT findTopperMarks()");
        rs.next();
        int marks = rs.getInt(1);
        rs.close();
        st.close();
        return marks;
    }
    @Override
    public String findTopperNameUsingFunc() throws SQLException 
    {
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT findTopperName()");
        rs.next();
        String name = rs.getString(1);
        rs.close();
        st.close();
        return name;
    }
}
