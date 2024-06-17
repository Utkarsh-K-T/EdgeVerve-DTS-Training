/*
Develop a Java program to manage student records using a Student class. 
Implement CRUD operations (Create, Read, Update, Delete) to add students, display all students, find a student by ID, update student details, remove a student by ID, and also provide functionality to sort students in descending order based on their marks. 

Student Class Definition  
Start by defining the Student class with attributes such as id, name, and marks. 
Include constructors, getters, setters, and toString() method for displaying student details. 

StudentManager Class Implementation 
Create a StudentManager class that manages student records using a List collection. 
Implement methods for CRUD operations (addStudent, displayAllStudents, findStudentById, updateStudent, removeStudent) and for sorting students by marks in descending order (sortStudentsByMarksDescending).  
*/
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student 
{
    protected int id, marks;
    protected String name;
    
    public Student(int id, String name, int marks) 
    {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    
    public int getId() 
    {
        return id;
    }
    
    public String getName() 
    {
        return name;
    }
    
    public int getMarks() 
    {
        return marks;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setMarks(int marks) 
    {
        this.marks = marks;
    }
    
    @Override
    public String toString() 
    {
        return "Students {ID: " + id + ", Name: " + name + ", Marks: " + marks + "}";
    }
}

public class cStudentManager
{
    private List<Student> students;
    public cStudentManager() 
    {
        students = new ArrayList<>();
    }

    public void addStudent(int id, String name, int marks) 
    {
        students.add(new Student(id, name, marks));
        System.out.println("Student added successfully.");
    }
    
    public void displayAllStudents() 
    {
        if (students.isEmpty()) 
        {
            System.out.println("No students in the list.");
        } 
        else 
        {
            System.out.println("List of students:");
            for (Student student : students) 
            {
                System.out.println(student);
            }
        }
    }
    
    public void findStudentById(int id) 
    {
        boolean found = false;
        for (Student student : students) 
        {
            if (student.getId() == id) 
            {
                System.out.println("Student found:");
                System.out.println(student);
                found = true;
                break;
            }
        }
        if (!found) 
        {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
    
    public void updateStudent(int id, String newName, int newMarks) 
    {
        boolean updated = false;
        for (Student student : students) 
        {
            if (student.getId() == id) 
            {
                student.setName(newName);
                student.setMarks(newMarks);
                System.out.println("Student details updated successfully.");
                updated = true;
                break;
            }
        }
        if (!updated) 
        {
            System.out.println("Student with ID " + id + " not found. Update failed.");
        }
    }
    
    public void removeStudent(int id) 
    {
        Iterator<Student> iterator = students.iterator();
        boolean removed = false;
        while (iterator.hasNext()) 
        {
            Student student = iterator.next();
            if (student.getId() == id) 
            {
                iterator.remove();
                System.out.println("Student removed successfully.");
                removed = true;
                break;
            }
        }
        if (!removed) 
        {
            System.out.println("Student with ID " + id + " not found. Removal failed.");
        }
    }

    public void sortStudentsByMarksDescending() 
    {
        Collections.sort(students, new Comparator<Student>() 
        {
            @Override
            public int compare(Student s1, Student s2) 
            {
                return Integer.compare(s2.getMarks(), s1.getMarks());
            }
        });
        System.out.println("Students sorted by marks (descending order):");
        displayAllStudents();
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        cStudentManager manager = new cStudentManager();
        
        int choice, id, marks;
        String name;

        do 
        {
            System.out.print("----------------------------------------");
            System.out.println("\nMenu");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Find Student by ID");
            System.out.println("4. Update Student Details");
            System.out.println("5. Remove Student by ID");
            System.out.println("6. Sort Students by Marks (Descending)");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            System.out.println("----------------------------------------");
            
            switch (choice) 
            {
                case 1:
                    System.out.print("Enter student ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter student name: ");
                    name = sc.nextLine();
                    System.out.print("Enter marks: ");
                    marks = sc.nextInt();
                    manager.addStudent(id, name, marks);
                    break;

                case 2:
                    manager.displayAllStudents();
                    break;

                case 3:
                    System.out.print("Enter student ID to find: ");
                    int findId = sc.nextInt();
                    manager.findStudentById(findId);
                    break;

                case 4:
                    System.out.print("Enter student ID to update: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter new marks: ");
                    int newMarks = sc.nextInt();
                    manager.updateStudent(updateId, newName, newMarks);
                    break;

                case 5:
                    System.out.print("Enter student ID to remove: ");
                    int removeId = sc.nextInt();
                    manager.removeStudent(removeId);
                    break;

                case 6:
                    manager.sortStudentsByMarksDescending();
                    break;

                case 7:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
            
        } 
        while (choice != 7);

        sc.close();
    }
}