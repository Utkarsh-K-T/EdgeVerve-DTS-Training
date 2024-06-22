package com.student.dao;

import java.sql.SQLException;
import java.util.List;

import com.student.model.Student;

public interface StudentDao 
{
    public void createStudentTable() throws SQLException;
    public void addStudent(Student s) throws SQLException;
    public List<Student> showAllStudents() throws SQLException;
    public void connect() throws SQLException;
    public void updateStudent(Student s) throws SQLException;
    public void deleteStudent(int id) throws SQLException;
}
