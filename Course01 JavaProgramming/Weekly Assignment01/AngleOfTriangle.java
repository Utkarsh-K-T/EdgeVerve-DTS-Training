//WAP to find angles of a triangle if two angles are given
import java.util.Scanner;

public class AngleOfTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch;
        double a1,a2,a3;

        do{
            System.out.print("Menu\n1.Get 3rd Angle of Triangle\n2.Exit\nEnter your choice : ");
            ch = sc.nextInt();

            switch(ch){
                case 1:
                    System.out.print("Enter the value of angle1 : ");
                    a1 = sc.nextDouble();

                    System.out.print("Enter the value of angle2 : ");
                    a2 = sc.nextDouble(); 

                    a3 = (180-(a1+a2));
                    System.out.println("Value of angle3 = "+a3);
                    break;

                case 2:
                    System.out.println("Exited the Program!");
                    break;
                
                default:
                    System.out.println("Invalid Input Please Try Again!");
            }
        }
        while(ch!=2);

        sc.close();
    }
}