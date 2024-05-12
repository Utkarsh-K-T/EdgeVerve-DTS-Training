/*
Polymorphisim : ablity to exibit multiple behaviours
Compile Time -> (eg.Overloading)
                Static Bindinb
                Dynamic Binding
Runtime -> (eg.Overriding) Dynamic hiding, late hiding, dynamic method dispatch
1.method name must be same
2.signature must be same
3. Inheritance mus be there
*/
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

public class ePolymorphisim {
    public static void main(String[] args) {
        /*
         This wil work even if student class has not methods or with same name
         Person ref = new Person();
         ref.show();
         */
        //Overriding
        Person ref = new Student();//Relevent to Student is invoked
        ref.show();

        ref = new Person();//Relevent to Person is invoked
        ref.show();
        //This is dynamic method dispatch
    }
}
