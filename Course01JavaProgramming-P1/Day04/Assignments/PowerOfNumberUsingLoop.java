//WAP to find Power of number using while loop
import java.util.Scanner;

public class PowerOfNumberUsingLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of base (i.e in a^b, a) : ");
        int base = sc.nextInt();

        System.out.print("Enter the value of exponent (i.e in a^b, b) : ");
        int expo = sc.nextInt();
        
        int i = 1;
        long val = 1;
        while(i<=expo){
            val *= base;
            i++;
        }
        System.out.printf("(%d ^ %d) = %d\n",base,expo,val);

        sc.close();
    }
}
