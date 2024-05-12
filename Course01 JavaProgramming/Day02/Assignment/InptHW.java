import java.util.Scanner;

public class InptHW {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //String
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        //Character
        System.out.print("Enter your gender (M/F): ");
        char gender = scanner.next().charAt(0);
        scanner.nextLine();
        //Integer
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        //Long
        System.out.print("Enter your ID number: ");
        long id = scanner.nextLong();
        scanner.nextLine();
        //Double
        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();
        scanner.nextLine(); 
        //Float
        System.out.print("Enter your weight (in kilograms): ");
        float weight = scanner.nextFloat();
        scanner.nextLine();
        //Boolean
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        scanner.nextLine(); 

        //Output
        System.out.println("\nStudent Details");
        System.out.println("\nName: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
        System.out.println("Height: " + height + " meters");
        System.out.println("Weight: " + weight + " kilograms");
        System.out.println("Student: " + isStudent);
        
        scanner.close();
    }
    
}
