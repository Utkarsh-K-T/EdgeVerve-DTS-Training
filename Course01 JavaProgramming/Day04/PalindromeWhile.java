import java.util.Scanner;

public class PalindromeWhile {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a number : ");
                int num = sc.nextInt();

                int n = num;
                int revnum = 0;

                while(n>0){
                    int dig = n%10;
                    revnum = revnum*10 + dig;
                    n/= 10;
                }

                if(revnum == num){
                    System.out.println(num+" is a palindrome!");
                }
                else{
                    System.out.println(num+" not a palindrome!");
                }

                sc.close();
            }
}

