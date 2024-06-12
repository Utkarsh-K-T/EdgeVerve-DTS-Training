import java.util.Scanner;

class ValidateAgeException extends Exception
{
    public ValidateAgeException(String msg)
    {
        super(msg);
    }
}

public class iCustomExceptionValidateAge 
{
    public static void main(String[] args) throws ValidateAgeException
    {
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter you age : ");
        age = sc.nextInt();

        try
        {
            if(age<18)
            {
                throw new ValidateAgeException("Not Eligible for license!");
            }
            else
            {
                System.out.println("Eligible!");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("bye");

        sc.close();
    }
}
