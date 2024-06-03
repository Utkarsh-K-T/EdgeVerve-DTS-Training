import java.util.Scanner;

public class SwitchCase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Day (1/2/3/4/5/6/7): ");
        int day = sc.nextInt();

        switch(day){
            case 1 :
                System.out.println("Sunday");
                break;
            case 2 :
                System.out.println("Mondayday");
                break;
            case 3 :
                System.out.println("Tuesdayday");
                break;
            case 4 :
                System.out.println("Wednesday");
                break;
            case 5 :
                System.out.println("Thursday");
                break;
            case 6 :
                System.out.println("Fridday");
                break;
            case 7 :
                System.out.println("Saturday");
                break;
            default :
                System.out.println("Invalid Input");
        }

        sc.close();

    }
}