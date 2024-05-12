//WAP to enter the month number between(1-12) and print the number of days in the month switch case.
import java.util.Scanner;


public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;

        do{
            System.out.print("\n1.Get number of Days in a month \n2.Exit\nEnter your choice : ");
            ch = sc.nextInt();
            sc.nextLine();

            switch(ch){
                case 1:
                    int month; 
                    System.out.print("Enter the month number 1-12 : ");
                    month = sc.nextInt();
                    sc.nextLine();
                    switch(month){
                        case 1,3,5,7,8,10,12:
                            System.out.println("There are 31 days in "+month+"th month.");
                            break;
                        case 4,6,9,11:
                            System.out.println("There are 30 days in "+month+"th month.");
                            break;
                        case 2:
                            System.out.print("Is it leap year?(yes/no)");
                            
                            String s = sc.nextLine();
                            if(s.equals("yes")){
                                System.out.println("There are 29 days in "+month+"th month.");
                            }
                            else{
                                System.out.println("There are 28 days in "+month+"th month.");
                            }
                            break;
                        default:
                            System.out.println("Invalid month Input!");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Exited the program successfully!");
                    break;
                default:
                    System.out.println("Invalid Input! Please Try Again!");
            }
        }
        while(ch!=2);
        sc.close();
    }
}
