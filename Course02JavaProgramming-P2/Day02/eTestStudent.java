interface Student
{
    void study();
}

abstract class Sample
{
    public abstract void show();
}

abstract class Subject
{
    public abstract void showSubject();
}

class Parent extends Sample
{
    @Override
    public void show()
    {
        System.out.println("What are you doing?");
    }
}

public class eTestStudent extends Subject
{
    @Override
    public void showSubject()
    {
        System.out.println("Java Programing-P2");
    }
    public static void main(String[] args) 
    {
        Parent parent = new Parent();
        Student student = new Student() {
            public void study() 
            {
                System.out.println("I am studying!");
            }
        };
        eTestStudent answer = new eTestStudent();
        parent.show();
        student.study();
        answer.showSubject();
    }

}
