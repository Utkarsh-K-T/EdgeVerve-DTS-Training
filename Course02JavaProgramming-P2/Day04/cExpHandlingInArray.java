import java.io.IOException;
import java.util.Scanner;

public class cExpHandlingInArray {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        
        int siz;
        System.out.print("Enter Size of array : ");
        siz = sc.nextInt();

        int[] arr;
        arr = new int[siz];
        for(int i=0; i<siz; i++)
        {
            System.out.print("Elem at "+i+" : ");
            arr[i] = sc.nextInt();
        }

        try{
            for(int i=0; i<arr.length; i++) //for(int i=0; i<=arr.length; i++)
            {
                arr[i]=i*2;
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }

        System.out.println("Elements of array are : ");
        for(int x : arr)
        {
            System.out.println(x);
        }
        sc.close();
    }
}
