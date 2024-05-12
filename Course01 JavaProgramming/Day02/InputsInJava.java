import java.util.Scanner;

public class InputsInJava {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        scanner.close();
        System.out.println("Hello, my name is " + name + " and am " + age + " years old.");
        System.out.printf("Hello, my name is %s and am %d years old.\n",name,age);
    }
}
