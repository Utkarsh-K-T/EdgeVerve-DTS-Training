import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elments in array : ");
        int n = sc.nextInt();

        int arr[], sum = 0;
        arr = new int[n];

        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        /* 
        for(int x:arr){
            sum += x;
        }
        */
        System.out.println("Sum of all elements of array : "+sum);
        
        sc.close();
    }
}
