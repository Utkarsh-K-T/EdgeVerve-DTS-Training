/*
Throws :

written with method signature not in body
primarily for checked exceptions

Difference between  
throw                                                                           | throws      
explicitly throw an exception from a method or a block of code                  | used in the method signature to declare that a method can throw one or more exceptions,  informs the caller of the method that they need to handle or propagate these exceptions
used within the method body to indicate that an exception should be thrown      | used in the method declaration, after the parameter list and before the method body
equires an instance of Throwable (typically an Exception or Error) to be thrown | primarily used for checked exceptions, which must be either caught or declared
*/
public class gThrowsInExceptions 
{
    public static void main(String[] args) throws ClassNotFoundException
    {
        try
        {
            method1();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("Bye!");
    }
    private static void method1() throws ClassNotFoundException
    {
        method2();
    }
    private static void method2() throws ClassNotFoundException
    {
        throw new ClassNotFoundException("Class Not Found!");
    }
}
