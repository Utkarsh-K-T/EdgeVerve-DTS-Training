//WAP to check whether a number is Strong number or not

import java.util.Scanner;

public class StrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt() ;

        int sum = 0;
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            int factorial = 1;
            for (int j = 1; j <= digit; j++) {
                    factorial *= j;
            }
            sum += factorial;
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num+" is a strong number!");
        }
        else{
            System.out.println(num+" is not a strong number!");
        }
        
        sc.close();
    }

}
