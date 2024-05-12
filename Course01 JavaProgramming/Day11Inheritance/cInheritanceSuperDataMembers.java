
import java.util.Scanner;

class Person 
{
    String name;
    int age;
    Person()
    {
        System.out.println("Default Constructor : Person class object created");
    }
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
        System.out.println("Paramiterized Constructor : Person class object created");
    }
    public void showPersonDetails()
    {
        System.out.println("Name : "+name+" Age : "+age);
    }
}

class Student extends Person
{
    String course;
    Student()
    {
        super("Unnamed", 0);
        System.out.println("Default Constructor : Student class object created");
    }
    Student(String name, int age, String course)
    {
        super(name,age);
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println("Paramiterized Constructor : Student class object created");
    }

    public void setDetails(String name, int age, String course){
        this.name=name;
        this.age=age;
        this.course=course;
    }
    public void showCourse()
    {
        System.out.println("Course : "+course);
    }
}

public class cInheritanceSuperDataMembers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student ref = new Student();
        
        ref.name = "Utkarsh";
        ref.age = 19;
        ref.course="B.E AI & Data Science";
        ref.showPersonDetails();;
        ref.showCourse();
        sc.close();
    }
}
