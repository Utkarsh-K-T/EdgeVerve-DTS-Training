import java.util.Scanner;

public class ArrayBinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in an array : ");
        int n = sc.nextInt();

        int arr[];
        arr = new int [n];

        System.out.println("Enter the elements of array : ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.print("Sorted array (Ascending) : ");
        for(int x: arr){
            System.out.print(x + " ");
        }
        int l=0;
        int u=n;
        int mid;
        int flag = 0;

        System.out.print("Enter the value of key : ");
        int key = sc.nextInt();
        while(l<=u){
            mid = (l+u)/2;
            if(arr[mid]==key){
                System.out.println(key + " is present!");
                flag = 1;
                break;
            }
            else if(arr[mid]>key){
                u = mid -1;
            }
            else{
                l = mid + 1;
            }
        }
        if(flag == 0){
            System.out.println(key+" is not present!");
        }

        sc.close();
    }
}
