import java.util.Scanner;
public class SmallestNumNestedIf{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = scanner.nextInt();
        System.out.print("Enter num3 : ");
        int num3 = scanner.nextInt();
        if(num1==num2 & num1==num3){
            System.out.println("all equal");
        }
        else{
            if(num1<num2){
                if(num1<num3){
                    System.out.println("num1");
                }
                else{
                    System.out.println("num3");
                }
            }
            else if(num2<num1){
                if(num2<num3){
                    System.out.println("num2");
                }
                else{
                    System.out.println("num3");
                }
            }
            else{
                if(num3<num1){
                    System.out.println("num3");
                }
                else{
                    System.out.println("num3");
                }
            }
        }
        scanner.close();
        
    }
}
