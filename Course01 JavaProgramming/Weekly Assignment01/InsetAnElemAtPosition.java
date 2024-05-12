//WAP to insert an element in an array at the specified position.
import java.util.Scanner;

public class InsetAnElemAtPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();
        sc.nextLine();
        int arr[];
        arr = new int[n];

        System.out.println("Enter "+n+" elements!");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The array is!");
        for(int x : arr){
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.print("Enter the position of element you want to Insert new element : ");
        int pos = sc.nextInt();

        if(pos>=0 && pos<n){
            System.out.print("Enter the new element : ");
            int elem = sc.nextInt();
            arr[pos] = elem;
            System.out.println("Update array!");
            for(int x:arr){
                System.out.print(x+" ");
            }
        }
        else{
            System.out.println("Invalid Index!");
        }
        sc.close();
    }
}
