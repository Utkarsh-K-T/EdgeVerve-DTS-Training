import java.util.Scanner;

public class InputCondition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num : ");
        int num = scanner.nextInt();

        if(num %  2==0){
            System.out.println("Its Even");
        }
        else{
            System.out.println("Its Odd");
        }
        scanner.close();

    }
}
