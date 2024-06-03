//Write a Java program to create a class called Shape with a method called getArea().
//Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

class Shape
{
    public void getArea()
    {
        System.out.println("The area method in Shape!");
    }
}

class Rectangle extends Shape
{
    public int len, bre;
    Rectangle()
    {

    }
    Rectangle (int len, int bre)
    {
        this.len = len;
        this.bre = bre;
    }
    @Override
    public void getArea()
    {
        System.out.println("The area of rectangle is  : "+(len*bre));
    }
}

public class aGetShapeAreaOverride{
    public static void main(String[] args) {
        Shape ref = new Shape();
        ref.getArea();
        ref=new Rectangle(12,3) ;
        ref. getArea();
    }
}