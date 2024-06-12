import java.util.Scanner;

public class aExceptionRevision{
    public static void main(String[] args) {
        int num1, num2, res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers : ");

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        try
        {
            res = num1/num2;
            System.out.println("Result = "+res);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Error Message : "+e.getMessage());
            System.out.println("Division by zero is not possible change the denominator (number 2)");
            res = num1/(num2+2);
            System.out.println("Result = "+res);
        }
        res = num1+num2;
        System.out.println("Result = "+res);
        
        sc.close();
    }
}