import java.util.Scanner;

class Student{
    int id;
    String name;

    @Override
    public String toString(){// in this class when you pass object we want this to happen always
        return "Student data : id : "+ id + ", name : "+name+" ]";
    }

    /*
    Constructor is a method, name of method must be same as class
    Speical member used to initialize an object while creation of object
    They cannot return any value
    */

    /* 
    default
    paramiterized
    */

    //default Consturctor
    Student(){
        id = 0;
        name = "Default";
    }

    //paramiterized constructors
    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    //constructor overloading
    Student(String name){
        this.id = 101;
        this.name = name;
    }

    //constructor chaining / chainged Constructors
    Student(int id){
        this(id,"Default");
    }

}


public class fConstructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s1 = new Student();
        System.out.println("Default Constructor : "+s1);

        Student s2 = new Student(01,"Utkarsh");
        System.out.println("Paramiterized Consturctor : "+s2);

        Student s3 = new Student("Nakul");
        System.out.println("Constructor Overloading : "+s3);

        Student s4 = new Student(102);
        System.out.println("Constructor Chaining : "+s4);

        sc.close();
    }
}
