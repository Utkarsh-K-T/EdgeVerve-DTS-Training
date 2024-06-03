import java.util.Scanner;
public class EnhancedForloop {
    public static void main(String[] args) {
        int arr [] = new int [5];
        int i;     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array Elements");

        for(i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        for(i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}

