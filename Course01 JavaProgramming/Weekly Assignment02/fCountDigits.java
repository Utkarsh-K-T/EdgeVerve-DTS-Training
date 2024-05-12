//WAP to count the number of digits in a given number by defining a method countDigit(n)
import java.util.Scanner;

public class fCountDigits {
    public static int countDigit(int n){
        int numDigits = 0;
        while(n>0){
            numDigits++;
            n /= 10;
        }
        return numDigits;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to count its total digits : ");

        int num = sc.nextInt();
        sc.nextLine();

        int res = 0;
        if(num>0){
            res = countDigit(num);
            System.out.printf("The number of digits in %d are : %d \n",num,res);
        }
        else if(num<0){
            int newnum = -num;
            res = countDigit(newnum);
            System.out.printf("The number of digits in %d are : %d \n",num,res);
        }
        else{
            res = 1;
            System.out.printf("The number of digits in %d are : %d \n",num,res);
        }

        sc.close();
    }
}
