package com.student.service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;
import com.student.dao.StudentDaoImpl;
import com.student.model.Student;

public class StudentService 
{

    public static void main(String[] args) throws SQLException 
    {
        StudentDaoImpl dao = new StudentDaoImpl();
        Scanner sc = new Scanner(System.in);
        int choice;

        do 
        {
            System.out.println("Menu\n1. Create Table Student \n2. Add New Student \n3. Show All Students \n4. Update Student \n5. Delete Student \n6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) 
            {
                case 1:
                    dao.connect();
                    dao.createStudentTable();
                    break;
                    
                case 2:
                    dao.connect();
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    System.out.print("Enter Total Marks: ");
                    int totalMarks = sc.nextInt();
                    sc.nextLine();
                    Student s = new Student(id, name, course, totalMarks);
                    dao.addStudent(s);
                    break;

                case 3:
                    dao.connect();
                    List<Student> students = dao.showAllStudents();
                    for (Student student : students) 
                    {
                        System.out.println(student);
                    }
                    break;

                case 4:
                    dao.connect();
                    System.out.print("Enter ID of the student to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter New Course: ");
                    String newCourse = sc.nextLine();
                    System.out.print("Enter New Total Marks: ");
                    int newTotalMarks = sc.nextInt();
                    sc.nextLine();
                    Student updatedStudent = new Student(updateId, newName, newCourse, newTotalMarks);
                    dao.updateStudent(updatedStudent);
                    break;

                case 5:
                    dao.connect();
                    System.out.print("Enter ID of the student to delete: ");
                    int deleteId = sc.nextInt();
                    sc.nextLine();
                    dao.deleteStudent(deleteId);
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }

        } 
        while (choice != 6);
        sc.close();
    }
}
