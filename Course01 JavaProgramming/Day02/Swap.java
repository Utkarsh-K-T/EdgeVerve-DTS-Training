public class Swap {
    public static void main(String[] args) {
        int a = 3, b = 0, c;
        System.out.println("Before Swap");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        c = a;
        a = b;
        b = c;
        System.out.println("After Swap");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        System.out.println("Before Swap");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        System.out.println("Before Swap");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After Swap");
        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
