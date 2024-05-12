//WAP to check whether the number is prime or not
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res="";

        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if(num<=1){
            res = "is not a prime number!";
        }
        else if(num<=3){
            res = "is a prime number!";
        }
        else{
            int i = 2;
            int cnt = 0;
            while(i<num){
                if(num%i == 0){
                    res = "is not a prime number!";
                    break;
                }
                else{
                    cnt++;
                }
                i++;
            }
            if(cnt==(num-2)){
                res = "is a prime number!";
            }
        }
        System.out.println(num +" "+ res);
        
        sc.close();
    }
}
