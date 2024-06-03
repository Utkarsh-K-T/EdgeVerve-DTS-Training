import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.naming.ldap.HasControls;
import java.util.Scanner;

public class aExpHandling{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a,b, res=0;

        System.out.print("Enter first naumber : ");
        a = sc.nextInt();

        System.out.print("Enter second number : ");
        b = sc.nextInt();

        try{
            res = a/b;
            System.out.println(a+" / "+b+" = "+res);
        }
        catch(ArithmeticException e){//is any other (ArryIndexOutOfBound) is used then it will throw error ArithmeticException is not used
            System.out.println(e.getMessage());
            System.out.println("Division by zero is not possible!");
        }

        res=a*b;
        System.out.println(a+" * "+b+" = "+res);

        sc.close();
    }
}