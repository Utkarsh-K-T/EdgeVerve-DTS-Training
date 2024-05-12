import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        String s = "";
        for(int i=num ; i>0; i/=2){
            if(i%2==0){
                s += "0";
            }
            else{
                s += "1";
            }

        }
        System.out.println(s);
        StringBuilder reversed = new StringBuilder(s).reverse();
        System.out.println(reversed);

        sc.close();
    }
    
}
