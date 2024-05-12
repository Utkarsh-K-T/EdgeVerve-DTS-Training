public class NumDig {
    public static void main(String[] args) {
        int numdig = 0;
        int num = 100;
        while(num>0){
            numdig++;
            num = num/10;
        }
        System.out.println(numdig);
    }
}
