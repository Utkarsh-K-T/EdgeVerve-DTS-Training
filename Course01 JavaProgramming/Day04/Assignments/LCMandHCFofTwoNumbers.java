//Find LCM and HCF of two numbers
import java.util.Scanner;

public class LCMandHCFofTwoNumbers{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of num1 : ");
        int num1 = sc.nextInt();

        System.out.print("Enter the value of num2 : ");
        int num2 = sc.nextInt();

        int mi,ma,i = 0;
        if(num1<num2){
            mi = num1;
            ma = num2;
        }
        else if(num2<num1){
            mi = num2;
            ma = num1;
        }
        else{
            mi = num1;
            ma = mi;
        }
        i = ma;
        while(true){
            if( (i%num1)==0 && (i%num2)==0 ){
                System.out.printf("LCM of %d and %d is %d\n",num1,num2,i);
                break;
            }
            i++;
        }
        i = mi;
        while(i>0){
            if((num1%i)==0 && (num2%i)==0){
                System.out.printf("HCF of %d and %d is %d\n",num1,num2,i);
                break;
            }
            i--;
        }
        sc.close();
    }
}