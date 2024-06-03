//WAP to find the sum of first n natural numbers using recursion

import java.util.Scanner;

public class eSumOfNnaturalNumbersRecursion {
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sum(n-1);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of natural number : ");
        int num = sc.nextInt();
        sc.nextLine();

        if(num>0){
            System.out.printf("Sum natural numbers up to %d is : ",num);
            int res = sum(num);
            System.out.print(res+"\n");
        }
        else{
            System.out.println("Entered number is not a natural number!");
        }
        sc.close();
    }
}
