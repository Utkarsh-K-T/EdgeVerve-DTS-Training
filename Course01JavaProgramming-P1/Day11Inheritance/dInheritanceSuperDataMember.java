class Person
{
    String id="F1001";
    public void show()
    {
        System.out.println("Person Class Method");
    }
}

class Student extends Person
{
    String id = "S1001";
    public void showId()
    {
        System.out.println("Student id : "+id);
        System.out.println("Person id : "+super.id);//without usin super it will refer to more specific data member here within the class one i.e inside studen class
        //Hence another usage of super keyword is to refer a data member to immidiate parent class
        //Hence another usage of super keyword is to invoke the parent class method
        super.show();
    }

}

public class dInheritanceSuperDataMember {
    public static void main(String[] args) {
        Student ref = new Student();
        ref.showId();
    }
}
