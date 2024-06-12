//Use to throw and exception manually/explicitly
//Mostly used in custom exceptions
import java.util.Scanner;

public class cThrowInExceptions 
{
    public static void main(String[] args) 
    {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age : ");
        age = sc.nextInt();
        
        eligibilityCheckForLicence(age);

        System.out.println("Go ahead with other formalities!");

        sc.close();
    }
    private static void eligibilityCheckForLicence(int age)
    {
        if(age<18)
        {
            throw new ArithmeticException("Not eligible for applying licence..age must be greter than or equal to 18!");
        }
        else
        {
            System.out.println("Eligible... you can submit your application!");
        }
    }
}
