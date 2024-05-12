import java.util.Scanner;

public class HWDiv{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = sc.nextInt();

        if( ((num %5)==0)  && ((num %7) ==0)){
            System.out.printf("Number %d is divisible by 5 & 7!",num);
        }
        else{
            System.out.printf("Number %d is not divisible by 5 & 7!",num);
        }
        sc.close();
    }
}