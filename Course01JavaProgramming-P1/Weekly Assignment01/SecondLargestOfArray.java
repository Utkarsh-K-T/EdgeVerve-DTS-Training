//WAP to find the second largest element in the array.
import java.util.Scanner;

public class SecondLargestOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        int arr [];

        do{
            System.out.print("\n1.Find Second largest number in an array!\n2.Exit\nEnter your choice : ");
            ch = sc.nextInt();
	        sc.nextLine();

            switch(ch){
                case 1:
                    System.out.print("Enter number of elements in array: ");
                    int n = sc.nextInt();
                    sc.nextLine();
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
                    int smx = -99999;
                    int mx = arr[0];
                    for(int i=0; i<n; i++){
                        if(mx<arr[i]){
                            smx = mx;
                            mx = arr[i];
                        }
                        else if(smx<arr[i] && arr[i]!=mx){
                            smx = arr[i];
                        }
                    }
                    System.out.println("Second Largest element in the array is "+ smx);
                    break;
                case 2:
                    System.out.println("Exited the program successfully!");
                    break;
                default:
                    System.out.println("Invalid Input! Please Try Again!");
            }
        }
        while(ch!=2);
        sc.close();
    }
}
