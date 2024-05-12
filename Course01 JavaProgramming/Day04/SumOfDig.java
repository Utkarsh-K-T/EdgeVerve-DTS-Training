public class SumOfDig {
    public static void main(String[] args) {
        int num = 123;
        int sum = 0;
        int numofdigs = 0;
        while(num>0){
            int dig = num%10;
            sum += dig;
            num/= 10;
            numofdigs++;
        }
        System.out.println("Sum of digits : "+sum);
        System.out.println("Number of digits : "+numofdigs);
    }
}
