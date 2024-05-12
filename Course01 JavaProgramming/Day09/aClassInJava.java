import java.util.Scanner;

class Student{
    // by default the members are public
    int id;     //instance variables : variables that declared any where inside the class but not outside this class
    String name;//instance variable
}

public class aClassInJava{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //objects are allocated memory in heaps
        //refrence variables memory is allocated in stack

        Student s1 = new Student();//Studen() is constructor
        Student s2 = new Student();
        /*
         Is there is no constructor / we don't initialize the methods then 
         jvm vill create a constructor with default values!
         Student(){
            id=0;
            name=null;
         }
         */
        System.out.println("id: "+s1.id+"\nname : "+s1.name);
        System.out.println("id : "+s2.id+"\nname : "+s2.name);
        s1.id = 101;
        s1.name = "Utkarsh";

        s2.id = 102;
        s2.name = "YoyoBantaiRapper";

        System.out.println("id: "+s1.id+"\nname : "+s1.name);
        System.out.println("id : "+s2.id+"\nname : "+s2.name);
        sc.close();


    }
}