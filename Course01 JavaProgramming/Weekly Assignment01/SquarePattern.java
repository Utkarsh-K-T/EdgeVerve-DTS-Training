//WAP to print square star pattern
import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of square : ");
        int s = sc.nextInt();
        int i = 0;
        int j = 0;

        
        for(i=0; i<s; i++){
            System.out.print("\t\t\t");
            for(j=0; j<s; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
