import java.util.Scanner;

public class WhileFact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int fact = 1;
        if(num == 0){
            fact = 1;
            System.out.println(fact);
        }
        else if(num>0){
            while(num>0){
                fact *= (num);
                num--;
            }
            System.out.println(fact);
        }
        else{
            System.out.println("No factorial for negative numbers");
        }
        sc.close();

    }
}
