
class School {
    private String name;

    School(String name) {
        this.name = name;
    }

    static class Student {
        private String name;
        private int rollNumber;

        Student(String name, int rollNumber) {
            this.name = name;
            this.rollNumber = rollNumber;
        }

        void displayInfo() {
            System.out.println("Student Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
        }
    }

    static class Teacher {
        private String name;
        private String subject;

        Teacher(String name, String subject) {
            this.name = name;
            this.subject = subject;
        }

        void displayInfo() {
            System.out.println("Teacher Name: " + name);
            System.out.println("Subject: " + subject);
        }
    }

    void displaySchoolInfo() {
        System.out.println("School Name: " + name);
    }
}

public class fMainSchoolMS {
    public static void main(String[] args) {
        // Create an instance of School
        School school = new School("MIS High School");

        // Create instances of Student and Teacher using the static inner classes
        School.Student student = new School.Student("Utkarsh", 101);
        School.Teacher teacher = new School.Teacher("Mr.Vaibhav", "Data Science");

        // Display the school information
        school.displaySchoolInfo();

        // Set and display student information
        System.out.println("\nStudent Information:");
        student.displayInfo();

        // Set and display teacher information
        System.out.println("\nTeacher Information:");
        teacher.displayInfo();
    }
}
