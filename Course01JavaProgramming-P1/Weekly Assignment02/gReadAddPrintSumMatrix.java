//WAP to find the sum of two matrices using methods.. readMatrix, printMatrix , findSum 

import java.util.Scanner;

public class gReadAddPrintSumMatrix {

    public static int[][] readMatrix(int rows, int cols){
        Scanner sc = new Scanner(System.in);
        int a[][];
        a = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.printf("Value at arr[%d][%d] : ",i,j);
                a[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }
        return a;
    }

    public static void printMatrix(int[][] a){
        for(int x[]: a){
            for(int y: x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }

    public static int [][] sumMatrix(int rows, int cols, int[][]a1, int[][]a2){
        int a3[][];
        a3 = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                a3[i][j]= (a1[i][j]+a2[i][j]);
            }
        }
        return a3;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows in 1st matrix : ");
        int r1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the number of cols in 1st matrix : ");
        int c1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the number of rows in 2nd matrix : ");
        int r2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the number of cols in 2nd matrix : ");
        int c2 = sc.nextInt();
        sc.nextLine();

        if(r1==r2 && c1==c2){
            //Input of 2 matrix
            System.out.println("Enter the elements in matrix 1 : ");
            int arr1[][];
            arr1 = new int [r1][c1];
            arr1 = readMatrix(r1, c1);
            System.out.println("Enter the elements in matrix 2 : ");
            int arr2[][];
            arr2 = new int [r2][c2];
            arr2 = readMatrix(r2, c2);

            //Displaying 2 matrices which have been taken as input
            System.out.println("Matrix 1 : ");
            printMatrix(arr1);
            System.out.println("Matrix 2 : ");
            printMatrix(arr2);

            //Displaying addition of both input matrices
            int arr3[][];
            arr3 = new int[r1][c1];
            arr3 = sumMatrix(r1, c1, arr1, arr2);
            System.out.println("Sum of Matrix 1 and Matrix 2 is : ");
            printMatrix(arr3);
        }
        else{
            System.out.println("Cannot perform addition of these 2 matirx as their number of rows and columns aren't equal!");
        }

        sc.close();
    }
}
