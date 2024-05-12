import java.util.Scanner;

public class TraceofTwoMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[][] = new int [3][3];
        int sum = 0;

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                a[i][j]=(int)(Math.random()*10);
            }
        }


        System.out.println("First Matrix is: ");
        for (int n1[]:a){
            for(int num : n1){
                System.out.print(num+" ");
            }
            System.out.println();
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                if(i==j){
                    sum += a[i][j];
                }
            }
        }
        System.out.println("Trace of Matrix : "+sum);

        sc.close();
    }
}
