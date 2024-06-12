/*
Method Overriding and Exception Handling:
1. Checked Exceptions Rule: If the superclass method declares a checked exception, the subclass overridden method can only declare the same exception, its subclass exception, or no exception at all. It cannot declare a new or broader checked exception.
2. Unchecked Exceptions Rule: If the superclass method does not declare a checked exception, the subclass is free to declare any unchecked (runtime) exception. Unchecked exceptions are not subject to the same restrictions as checked exceptions.
3. New or Broader Checked Exceptions Rule: The subclass method cannot declare new or broader checked exceptions than those declared by the superclass method. This ensures that the overridden method does not throw exceptions that are unexpected based on the superclass method.
*/

class Parent
{
    public void show()
    {
        System.out.println("Parent show");
    }
}

class Child extends Parent
{
    @Override
    public void show() throws ArithmeticException
    {
        System.out.println("Child show");
    }
}

public class jException 
{
    public static void main(String[] args) 
    {
        Parent p = new Child();
        try 
        {
            p.show();
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Caught ArithmeticException");
        }
    }
}