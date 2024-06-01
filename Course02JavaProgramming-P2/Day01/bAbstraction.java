/*
Abstract Class
Its is a class which has one or more abstract methods and non-abstract (concrete methods
abstract keyword... only declaration will be there
abstract methods must be overridden by subclass of the abstract class
If the subclass is not overriding the implementation details of abstract methods
in the parent abstract class... that subclass will also become an abstract class
data members, static methods, abstract methods, non-abstract methods, constructors in an abstract class
No.. we can't instantiate an abstract class - we cant create objects of abstarct class
*/

abstract class Shape
{
    protected String color;
    protected boolean filled;

    public Shape(String color, boolean filled) 
    {
        this.color = color;
        this.filled = filled;
    }

    abstract double findArea();

    public Shape()
    {
        System.out.println("Shape Costructor is created");
    }
    public void display()//abstract class support non abstract methods(Concrete methods)or constructors
    {
        System.out.println("This is a Shape!");
    }

    @Override
    public String toString()
    {
        return "Shape [color = "+color+", filled = "+filled+" ]\n";
    }


    public static boolean compareArea(Shape s1, Shape s2)
    {
        return s1.findArea()==s2.findArea();
    }
}

class Rectangle extends Shape
{
    double length, breadth;

    public Rectangle(String color, boolean filled, double length, double breadth)
    {
        super(color,filled);
        this.length = length;
        this.breadth = breadth;
    }


    @Override
    double findArea() 
    {
        // TODO Auto-generated method stub
        return length*breadth;
    }

    @Override
    public String toString()
    {
        return "Rectangle [Length = "+length+", Breadth = "+breadth+", Color = "+color+", Filled = "+filled+" ]\n";
    }

}

class Circle extends Shape
{
    private double radius;
    
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    double findArea() {
        // TODO Auto-generated method stub
        return 3.14*radius*radius;
    }

    @Override
    public String toString()
    {
        return "Circle [ Radius = "+radius+", Color = "+color+", Filled = "+filled+" ]\n";
    }

}

public class bAbstraction 
{
    public static void main(String[] args) 
    {
        Rectangle ref1 = new Rectangle("Red",true,3,6);
        System.out.printf("Area of Rectange : "+ref1.findArea()+"\n");
        System.out.println(ref1);

        Circle ref2 = new Circle("Blue",false,9);
        System.out.printf("Area of Cicle : "+ref2.findArea()+"\n");
        System.out.println(ref2);
        if(Shape.compareArea(ref1,ref2))
        {
            System.out.println("Same areas");
        }
        else
        {
            System.out.println("Different areas");
        }


        Rectangle ref3 = new Rectangle("Red",true,3.14,4);
        System.out.printf("Area of Rectange : "+ref3.findArea()+"\n");
        System.out.println(ref3);

        Circle ref4 = new Circle("Blue",false,2);
        System.out.printf("Area of Cicle : "+ref4.findArea()+"\n");
        System.out.println(ref4);
        if(Shape.compareArea(ref3,ref4))
        {
            System.out.println("Same areas");
        }
        else
        {
            System.out.println("Different areas");
        }
    }
}
