//abstract class : only essential details will shown background details will be hidden
abstract class Shape
{
    public abstract void display();
    public void show()
    {
        System.out.println("In show");
    }

}

class Rectangle extends Shape
{

    @Override
    public String toString() {
        return "Rectangle []";
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'display'");
    }
    
}


{

}

public class jAbstractors 
{
    public static void main(String[] args) {
        Shape s = new Shape();
    }
}
