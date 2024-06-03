//WAP to print Pascal's triangle up to n rows
import java.util.Scanner;

public class dPascalsTriangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter the number of rows for Pascals Triangle : ");
        n = sc.nextInt();
        sc.nextLine();

        if(n>=0){
            int i =0, j=0, sp=0, num=1;
            System.out.printf("Pascals Triangle up to %d row is : \n",n);
            while(i<=n){
                while(sp<=(n-i)){
                    System.out.print(" ");
                    sp++;
                }
                num=1;
                j=0;
                while(j<=i){
                    System.out.print(num+" ");
                    num = num*(i-j)/(j+1);
                    j++;
                }
                System.out.println();
                i++;
                j=0;
                sp=0;
            }
        }
        else{
            System.out.println("Can't print Pascals Triangle because row number must be non-negative!");
        }
        
        sc.close();
    }
}