import java.util.Scanner;

public class SumofTwoDmatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[][] = new int [2][3];
        int b[][]= new int [2][3];

        int c[][] = new int [2][3];

        
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                a[i][j]=(int)(Math.random()*10);
            }
        }
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                b[i][j]=(int)(Math.random()*10);
            }
        }

        System.out.println("First Matrix is: ");
        for (int n1[]:a){
            for(int num : n1){
                System.out.print(num+" ");
            }
            System.out.println();
        }
        System.out.println("Second Matrix is ");
        for (int n2[]:b){
            for(int num : n2){
                System.out.print(num+" ");
            }
            System.out.println();
        }
        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                c[i][j]=(a[i][j])+(b[i][j]);
            }
        }

        for (int n3[]:c){
            for(int num : n3){
                System.out.print(num+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
