import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bRegexMatcher 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        String regex;
        String input;
        int choice;
        
        do
        {
            System.out.println("Menu");
            System.out.println("1. Execute Regex\n2. Exit");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();
            sc.nextLine();

            if(choice==2)
            {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter the regex : ");
            regex = sc.nextLine();
            System.out.print("Enter the input String : ");
            input = sc.nextLine();
        
            Pattern pattern = Pattern.compile(regex);//Compiles the given regular expression into a pattern.
            Matcher matcher = pattern.matcher(input);
        
            while (matcher. find ())
            {
                System.out.println ("Found match : "+matcher.group ()) ;
                System.out.println("At strat index : "+matcher.start ()) ;
                System.out.println("At end index : "+matcher.end ()) ;
                System.out.println(matcher.matches());
            }

        }
        while(choice!=2);
        sc.close();
    }
}
