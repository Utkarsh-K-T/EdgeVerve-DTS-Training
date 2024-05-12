// WAP to convert days into years, weeks, and days.
import java.util.Scanner;

public class DaysToWeeksMonthsYears {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalDays,years,remainingDays,weeks,months;
        char ch;
        do{
            System.out.print("\n1.Perform Conversion of Days to Years/Months/Weeks \n2.Exit\nEnter your choice : ");
            ch = sc.next().charAt(0);

            switch(ch){
                case '1':
                    System.out.print("Enter the number of days: ");
                    totalDays = sc.nextInt();
        
                    years = totalDays / 365;
                    remainingDays = totalDays % 365;
                
                    months = remainingDays / 30;
                    remainingDays = remainingDays % 30;
                
                    weeks = remainingDays / 7;
                    remainingDays = remainingDays % 7;
        
                    String s1 = " year, ";
                    String s2 = " month, ";
                    String s3 = " week, & ";
                    String s4 = " day. ";
        
                    if(years>1){
                        s1 = " years, ";
                    }
                    if(months>1){
                        s2 = " months, ";
                    }
                    if(weeks>1){
                        s3 = " weeks, & ";
                    }
                    if(remainingDays>1){
                        s4 = " days. ";
                    }
                    System.out.println(totalDays+" days is equivalent of "+years+s1+months+s2+weeks+s3+remainingDays+s4);
                    break;
                case '2':
                    System.out.println("Exited the program successfully!");
                    break;
                default :
                    System.out.println("Invalid Input! Please Try again!");
            }
        }
        while(ch!='2');
        sc.close();
    }
}
