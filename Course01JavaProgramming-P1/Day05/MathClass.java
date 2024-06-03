import java.lang.Math;

public class MathClass {
    public static void main(String[] args) {
        System.out.println(Math.pow(2,3));
        System.out.println((int)Math.pow(2,3));

        System.out.println(Math.sqrt(16));
        System.out.println((int)Math.sqrt(16));

        int num = 12345, digit;
        digit = (int)Math.log10(num)+1;
        System.out.println(digit);
        
    }
    
}
