//WAP to find the average of numbers using variable length arugmuent method

import java.util.Scanner;

public class iAvgOfNumUsingVariableLengMethod{
    public static double avg(int totalNum ,double... num){
        double sum = 0;
        for(double x: num){
            sum += x;
        }
        double res = (sum/totalNum);
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the total numbers for avg : ");
        int t = sc.nextInt();
        sc.nextLine();

        double arr[];
        arr = new double[t];

        System.out.println("Enter the numbers : ");
        for(int i=0; i<t; i++){
            arr[i] = sc.nextDouble();
            sc.nextLine();
        }

        System.out.print("The average of : ");
        for(double x: arr){
            System.out.print(x+", ");
        }
        double avgofall = avg(t,arr);
        System.out.printf("is : %f \n",avgofall);
        sc.close();
    }
}