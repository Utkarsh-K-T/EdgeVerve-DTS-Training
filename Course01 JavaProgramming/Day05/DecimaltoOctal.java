import java.util.Scanner;

public class DecimaltoOctal {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        String s = "";
        for(int i=num ; i>0; i/=8){
            int rem = i%8;
            if(rem==0){
                s+="0";
            }
            else{
                if(rem == 1 ){
                    s+="1";
                }
                else if(rem == 2 ){
                    s+="2";
                }
                else if(rem == 3 ){
                    s+="3";
                }
                else if(rem == 4 ){
                    s+="4";
                }
                else if(rem == 5 ){
                    s+="5";
                }
                else if(rem == 6 ){
                    s+="6";
                }
                else{
                    s+="7";
                }
            }

        }
        System.out.println(s);
        StringBuilder reversed = new StringBuilder(s).reverse();
        System.out.println(reversed);

        sc.close();
    }
}
