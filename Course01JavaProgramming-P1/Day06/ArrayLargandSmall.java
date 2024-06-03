import java.util.Scanner;

public class ArrayLargandSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elments in array : ");
        int n = sc.nextInt();

        int arr[], la = 0, sm = 10000000;
        arr = new int[n];

        System.out.println("Enter the elements of array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(arr[i]>la){
                la = arr[i];
            }
            if(arr[i]<sm){
                sm = arr[i];
            }
        }
        System.out.println("Largest = "+la+"\nSmallest = "+sm);

        System.out.print("Enter the number of elments in array : ");
        int m = sc.nextInt();
        int arr2[], ma, mi;
        arr2 = new int[m];

        System.out.println("Enter the elements of array");
        for(int i=0; i<m; i++){
            arr2[i] = sc.nextInt();

        }
        mi = arr[0];
        ma = arr[0];
        for(int x:arr2){
            if(x<mi){
                mi = x;
            }
            else{
                ma =x;
            }
        }
        System.out.println("Largest = "+ma+"\nSmallest = "+mi);
        sc.close();
    }
}
