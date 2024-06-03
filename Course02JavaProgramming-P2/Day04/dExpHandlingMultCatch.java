import java.util.Scanner;

public class dExpHandlingMultCatch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr;
        arr = new int[4];

        for(int i=0; i<4; i++)
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
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e)
        {
            System.out.println(e.getMessage());
        }
        catch(IndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
        /*
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());
        }
         */
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Finally Block");
        }


        System.out.println("Elements of array are : ");
        for(int x : arr)
        {
            System.out.println(x);
        }
        sc.close();
    }
}