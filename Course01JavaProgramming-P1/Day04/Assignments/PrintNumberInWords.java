// WAP to print a given number in words
import java.util.Scanner;

public class PrintNumberInWords{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number (0 to 9999) : ");
        int num = sc.nextInt();

        String[] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        String res = "";
            while (num >= 0) {
                if (num < 10) {
                    res += ones[num];
                    num = -1;
                } 
                else if (num< 20) {
                    res += teens[num - 10];
                    num = -1;
                } 
                else if (num < 100) {
                    res += tens[num / 10];
                    if(num%10==0){
                        num = -1;
                    }
                    else{
                        num = (num%10);
                    }
                } 
                else if (num< 1000) {
                    res += ones[num / 100] + " hundred ";
                    if(num%100==0){
                        num = -1;
                    }
                    else{
                        num = (num%100);
                    }
                }
                else if (num < 10000) {
                    res += ones[num / 1000] + " thousand ";
                    if(num%1000==0){
                        num = -1;
                    }
                    else{
                        num = (num%1000);
                    }
                }
                else {
                    // Extend this as needed for larger numbers
                    res += "Number out of range";
                    num = -1;
                }
                if (num >= 0) {
                    res += " ";
                }
            }
        System.out.println(res);
        sc.close();
    }
}