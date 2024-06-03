/*
Inheritance:
reusability -> can be reused
extensability -> can be extended easily

         Inheritance

            car
             ^
             |
             |
         Maruti car

Types of Inheritance 
1) Single level inheritance : one base/super/parent class with multiple subclass/child class
2) Multilevel Inheritance : one base class one child class which is parent for its next child class
3) Hierachical Inheritance : one base/class and multiple subclass level as we go down it more specific
4) Hybrid Inheritance : combination of two or more types of inheritance.
5) Multiple Inheritance : due to aambiguity error this inheritance is not allowed directly using interface (In c this is called diamond problem which is solved by usin virtual keyword)

*/
import java.util.Scanner;

class Person //super class / parent class/ base class
{
    String name;
    int age;
    public void showPersonDetails()
    {
        System.out.println("Name : "+name+" Age : "+age);
    }
}

class Student extends Person// subclass or child class or derived class
{
    String course;
    public void showCourse()
    {
        System.out.println("Course : "+course);
    }
}

public class aInheritance{
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