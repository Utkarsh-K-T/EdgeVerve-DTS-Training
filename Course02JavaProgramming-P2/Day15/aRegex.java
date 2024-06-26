/*
Regex :
Regular expressions used mainly for pattern matching.
*/

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class aRegex
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
        
            System.out.println(matcher.matches());

        }
        while(choice!=2);
        sc.close();

    }
}