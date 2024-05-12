//WAP to delete the element at a particular position in the array
import java.util.Scanner;

public class DeleteAnElementAtPosition {
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

        System.out.print("Enter the position of element you want to delete : ");
        int pos = sc.nextInt();

        if(pos<n && pos>=0){
            for(int i=pos; i<n-1; i++){
                arr[i] = arr[i+1];
            }
            n--;
            System.out.println("Update array is!");
            for(int i=0; i<n; i++){
                System.out.print(arr[i]+" ");
            }
        }
        else{
            System.out.println("Invalid index value!");
        }
        sc.close();
    }
}
