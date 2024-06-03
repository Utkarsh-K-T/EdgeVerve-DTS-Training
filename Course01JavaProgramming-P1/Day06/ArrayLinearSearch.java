import java.util.Scanner;

public class ArrayLinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elments in array : ");
        int n = sc.nextInt();

        int arr[];
        arr = new int[n];


        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }


        System.out.print("Enter key : ");
        int key  = sc.nextInt();
        int flag = 0;

        for(int x: arr){
            if(x == key){
                System.out.println(key+" is present in array!");
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println(key+" is not present in array!");
        }
        sc.close();
    }
}
