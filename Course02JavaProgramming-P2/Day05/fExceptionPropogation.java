import java.io.IOException;

public class fExceptionPropogation 
{
    public static void main(String[] args) throws NumberFormatException, IOException
    {
        try
        {
            method1(10,0);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Caught by main method handler : "+e.getMessage());
        }
        System.out.println("Bye");
    }
    private static void method1(int a, int b)
    {
        method2(a,b);
    }
    private static void method2(int a, int b)
    {
        int c=a/b;
        System.out.println(c);
    }

}
