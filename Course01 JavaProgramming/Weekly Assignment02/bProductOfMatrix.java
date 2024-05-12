/*
WAP to find the product of 2 matrix
*/

import java.util.Scanner;

public class bProductOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m, n, o, p, i, j, k, res=0;
        System.out.println("Enter the dimensions of 1st matrix : ");
        System.out.print("Etner the number of rows : ");
        m = sc.nextInt();
        System.out.print("Etner the number of columns : ");
        n = sc.nextInt();

        System.out.println("Enter the dimensions of 2nd matrix : ");
        System.out.print("Etner the number of rows : ");
        o = sc.nextInt();
        System.out.print("Etner the number of columns : ");
        p = sc.nextInt();

        int arr1[][];
        arr1 = new int[m][n];

        int arr2[][];
        arr2 = new int[o][p];

        if(n==o){
            int arr3 [][];
            arr3 = new int[m][p];

            System.out.println("Enter the elements of 1st matrix [][] : ");
            for(i=0; i<m; i++){
                for(j=0; j<n; j++){
                    System.out.print("Enter value at arr["+i+"]["+j+"] : ");
                    arr1[i][j] = sc.nextInt();
                    sc.nextLine();
                }
            }

            System.out.println("Enter the elements of 2nd matrix [][] : ");
            for(i=0; i<o; i++){
                for(j=0; j<p; j++){
                    System.out.print("Enter value at arr["+i+"]["+j+"] : ");
                    arr2[i][j] = sc.nextInt();
                    sc.nextLine();
                }
            }

            System.out.println("The 1st matrix is : ");
            for(int x[]:arr1){
                for(int y:x){
                    System.out.print(y+" ");
                }
                System.out.println();
            }

            System.out.println("The 2nd matrix is : ");
            for(int x[]:arr2){
                for(int y:x){
                    System.out.print(y+" ");
                }
                System.out.println();
            }
        
            for(i = 0; i<m; i++){                   
                for(j=0; j<p; j++){
                    for(k=0; k<o; k++){
                        res = res + (arr1[i][k]*arr2[k][j]);
                    }
                    arr3 [i][j] = res;
                    res = 0;
                }
                res = 0;
            }

            System.out.println("The product of matrix 1 & matrix 2 is : ");
            for(int x[]:arr3){
                for(int y: x){
                    System.out.print(y+" ");
                }
                System.out.println();
            }
        }

        else{
            System.out.println("Product of matrices is not possible as the number of columns of 1st matrix is not equvivalent to number of rows of 2nd matrix!");
        }

        sc.close();
    }
}
