public class largest3 {
    public static void main(String[] args) {
        int a=10,b=5,c=15;
        int max_a_b = (a>b) ? a:b;
        int max_a_b_c = (c>max_a_b) ? c :max_a_b;
        int maxabc = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println(max_a_b_c);
        System.out.println(maxabc);

    }
}
