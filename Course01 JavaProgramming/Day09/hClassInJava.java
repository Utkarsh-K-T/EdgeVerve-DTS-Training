import java.util.Scanner;


public class hClassInJava {
    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String name = sc.nextLine();
        hClassInJava.setName();
    }
    public static void setName(){
        String name = sc.nextLine();
    }
}
//finalize is like destructors
//most of the time we have no need of destructors in java as it has garbage colletor