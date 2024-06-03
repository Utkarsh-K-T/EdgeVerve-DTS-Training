//WAP to check whether a number is armstrong number or not

import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt() ;

        int sum = 0;
        int numberOfDigits = String.valueOf(num).length();
        int temp = num;
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numberOfDigits);
            temp /= 10;
        }
        if (sum == num) {
            System.out.println(num+" is an armstrong number!");
        }
        else{
            System.out.println(num+" is not an armstrong number!");
        }
        
        sc.close();
    }
}
