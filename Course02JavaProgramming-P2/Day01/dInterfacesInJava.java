/*
Interface : 
only abstract methods & static constants
Java8 default and static methods
java9 private
we can achieve the multiple inheritance features
loose coupling

Functional Interface : only one abstract method
*/

interface Person
{
    static final String species = "Homosapiens";
    public void getName();
    public void showDetails();
    public default void display()
    {
        System.out.println("Welcome Employee! You belong to "+species);
    }
}

interface Dancer
{
    static final String skill = "Dancing";
    public void showSkill();
}

interface ClassicalDancer extends Dancer
{
    public void canDoClassicalDance();
}

class LivingOrganism
{
    public void show()
    {
        System.out.println("Living Organism");
    }
}

//Achieve multiple inhertance in java indirectly using interfaces
class Employees extends LivingOrganism implements Person,ClassicalDancer //,Dancer
{
    private int id;
    private String name;
    public Employees(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
    @Override
    public void getName()
    {
        System.out.println(name);
    }

    @Override
    public void showDetails()
    {
        System.out.println(id+" "+name+" "+species);
    }

    @Override
    public void showSkill()
    {
        System.out.println(skill);
    }
    @Override
    public void canDoClassicalDance()
    {
        System.out.println("Yes can Do Classical Dance");
    }
}

public class dInterfacesInJava 
{
    public static void main(String[] args) 
    {
        Employees emp1 = new Employees(10, "Ram");
        emp1.getName ();
        emp1.showDetails ();
        emp1.display();
        emp1.showSkill();
        emp1.show();
        emp1.canDoClassicalDance();
        /*
        Persong emp1 = new Employee(10,"Ram");
        */
    }
}
