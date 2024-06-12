import java.util.Scanner;


public class bExceptionFinallyBlock {
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

        finally
        {
            System.out.println("finally block");
        }
        //Exception not genreate finally executed (give inputs as 10, 2)
        //Exceptinon genreated not handled finally executed (change catch(NullPointerException e) and give inputs 10, 0)
        //Exception gnerated, handled finally executed (don't make any changes in the code and give inputs 10,0)
        res = num1+num2;
        System.out.println("Result = "+res);
        
        sc.close();
    }
}
