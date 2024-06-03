import java.util.Scanner;
public class EvenOrOddBitwise{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = scanner.nextInt();

        if((num & 1 ) == 0){
            System.out.println("Its Even");
        }
        else{
            System.out.println("Its Odd");
        }

        if((num & 1 ) == 1){
            System.out.println("Its Odd");
        }
        else{
            System.out.println("Its Even");
        }
        scanner.close();

    }
}
