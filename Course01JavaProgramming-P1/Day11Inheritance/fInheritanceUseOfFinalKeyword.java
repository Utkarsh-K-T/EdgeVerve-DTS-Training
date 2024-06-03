class Person{
    void show()
    {
        System.out.println("Person Show emthod");
    }
}

class Student extends Person
{
    @Override
    void show()
    {
        System.out.println("Student Show method");
    }
}

/*
 Use of final with
 1.Data member
 2.Class
 3.Method
 */

public class fInheritanceUseOfFinalKeyword {
    public static void main(String[] args) {
            Person ref = new Student();
            ref.show();
    
            ref = new Person();
            ref.show();
        }
}
