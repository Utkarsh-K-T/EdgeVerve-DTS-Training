// WAP to check whether given matrix is upper triangular or not
import java.util.Scanner;

public class cUppertriangularMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][];

        System.out.print("Enter the number of rows in matrix : ");
        int m = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the number of columns in matrix : ");
        int n = sc.nextInt();
        sc.nextLine();

        if(m==n){
            int i,j,flag = 0;
            arr = new int[m][n];
            System.out.println("Enter the elements of matrix : ");
            for(i=0; i<m; i++){
                for(j=0; j<n; j++){
                    System.out.printf("Value at arr[%d][%d] : ",i,j);
                    arr[i][j] = sc.nextInt();
                    sc.nextLine();
                }
            }

            System.out.println("The matrix is : ");
            for(int x[]: arr){
                for(int y: x){
                    System.out.print(y+" ");
                }
                System.out.println();
            }
            for(i=0; i<m; i++){
                for(j=0; j<n; j++){
                    if(i>j){
                        if(arr[i][j]==0){
                            flag = 1;
                        }
                        else{
                            flag = 0;
                            break;
                        }
                    }
                }
            }
            if (flag == 1){
                System.out.println("The above matrix is an upper triangular matrix!");
            }
            else{
                System.out.println("The above matrix is not an upper triangular matrix not all elements below diagonal are zeros!");
            }
        }
        else{
            System.out.println("The above matrix is not an upper triangular matrix, as its not a square matrix!");
        }
        sc.close();
    }
}
