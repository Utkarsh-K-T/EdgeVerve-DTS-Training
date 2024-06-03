import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Length: ");
        int length = scanner.nextInt();

        System.out.print("Enter Breadth : ");
        int breadth = scanner.nextInt();

        scanner.close();

        int ar = length*breadth;
        System.out.println("Area of rectangle :"+ar);
    }
}
