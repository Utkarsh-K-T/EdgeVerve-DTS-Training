import java.util.Scanner;

/*
 Private data members can only be accessed by public methods of that particualar class only
 Protected 
 Default if not specified anything
 */
/*
For every class super() method is there to invok the base/parent class constructor
even if we not include super() method it present implicitly so it always executes

In java the Object class is always extend by the super class
*/
class Person //extends Object
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
        System.out.println("Paramiterized Constructor : Person class object created");//this is not printed check next program for why?
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
        System.out.println("Default Constructor : Student class object created");
    }
    Student(String name, int age, String course)
    {
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println("Paramiterized Constructor : Student class object created");//this is not printed check next program for why?
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

public class bInheritanceDataMembers {
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
