import java.util.Scanner;

@FunctionalInterface
interface NumberCheck 
{
    boolean check(int num);
}


public class kIsEvenQuestion
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        NumberCheck isEven = 
        (a) ->
        {
            return ((a%2==0)? true:false);
        };

        System.out.print("Enter a number ");
        int a = sc.nextInt();
        System.out.println(isEven.check(a));
        
        sc.close();
    }
}
