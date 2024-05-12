import java.util.Scanner;
public class CharInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Enter ch : ");
        char ch = scanner.next().charAt(0);
        scanner.nextLine();
        System.out.println(ch);

        String s;
        char c;
        System.out.printf("Enter String : ");
        s = scanner.next();
        c = s.charAt(0);
        System.out.println(c);

        scanner.close();
    }
}
