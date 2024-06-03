//WAP to print fibonacci series upto n terms

import java.util.Scanner;

public class FibonacciSeriesUpto{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int num = sc.nextInt() ;

        int first = 0;
        int second = 1;
        
        System.out.println("* Fibonacci Series *" ); 
        System.out.print(first + " " + second + " ");
        
        for (int i = 3; i <= num; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }

        sc.close();
    }
}