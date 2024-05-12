public class Qeust{
    public static void main(String[] args) {
        int x=10; 
        x+=++x + x++ + --x;
        System.out.println(x);
    }
}