/*
WAP to Check whether given matrix is symmetric or not
*/
import java.util.Scanner;

public class aSymmetricMattrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m, n;
        System.out.println("Enter the dimensions of array : ");
        System.out.print("Etner the number of rows : ");
        m = sc.nextInt();
        System.out.print("Etner the number of columns : ");
        n = sc.nextInt();

        int arr[][];
        arr = new int[m][n];
        int i,j,flag = 0;

        String remk = "Input matrix is a square matrix and the transpose of matrix is equivalent to input matrix!";

        if(m==n){
            System.out.println("Enter the elements of matrix [][] : ");
            for(i=0; i<m; i++){
                for(j=0; j<n; j++){
                    System.out.print("Enter value at arr["+i+"]["+j+"] : ");
                    arr[i][j] = sc.nextInt();
                    sc.nextLine();
                }
            }
            System.out.println("The input matrix is : ");
            for(int x[]:arr){
                for(int y:x){
                    System.out.print(y);
                }
                System.out.println();
            }

            for(i=0; i<m; i++){
                for(j=0; j<n; j++){
                    if(arr[i][j]==arr[j][i] || i==j){
                        flag = 1;
                    }
                    else{
                        flag = 0;
                        remk = "As the transpose is not equivalent to orignal matrix!";
                        break;
                    }
                }
            }
        }
        else{
            flag = 0;
            remk = "As its not a square matrix!";
        }

        if(flag==1){
            System.out.println("The matrix is Symmetric!");
            System.out.println(remk);
            System.out.println("Transpose of matrix is : ");
            for(i=0; i<m; i++){
                for(j=0; j<n; j++){
                    System.out.print(arr[j][i]);
                }
                System.out.println();
            }

        }
        else{
            System.out.println("The matrix is not Symmetric!");
            System.out.println(remk);
            System.out.println("Transpose of matrix is : ");
            for(i=0; i<m; i++){
                for(j=0; j<n; j++){
                    System.out.print(arr[j][i]);
                }
                System.out.println();
            }
        }
        
        sc.close();
    }
}