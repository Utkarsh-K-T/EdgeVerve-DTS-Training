import java.util.Scanner;

public class TwoDArrayRandomInpt{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[][] = new int [2][3];
        int i,j;

        for(i=0; i<2; i++){
            for(j=0; j<3; j++){
                a[i][j] = (int)(Math.random()*100);
            }
        }
        for(i=0; i<2; i++){
            for(j=0;j<3; j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}