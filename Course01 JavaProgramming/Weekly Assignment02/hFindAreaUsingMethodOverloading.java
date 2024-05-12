// WAP to define findArea method using method overlaoding for square, rectangle, circle.
import java.util.Scanner;

class AreaOfFig{
    public float area(float s){
        return (s*s);
    }
    public float area(float a, float b){
        return (a*b);
    }
    public double area(double r){
        return (3.14*r*r);
    }
}

public class hFindAreaUsingMethodOverloading{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaOfFig AreaCal = new AreaOfFig();
        int ch = 1;
        do{
            System.out.print("\n1.Find Area of Square\n2.Find Area of Rectange\n3.Find Area of Square\n4.Exit\nEnter your choice : ");
            ch = sc.nextInt();
	        sc.nextLine();

            switch(ch){
                case 1:
                    System.out.print("Enter the side of Square : ");
                    float side = sc.nextFloat();
                    sc.nextLine();
                    float AreaSquare = AreaCal.area(side);
                    System.out.printf("Area of Square with side %f is %f. sq.units. \n",side,AreaSquare);
                    break;
                case 2:
                    System.out.print("Enter the length of Rectangle : ");
                    float leng = sc.nextFloat();
                    sc.nextLine();
                    System.out.print("Enter the breadth of Rectangle : ");
                    float brea = sc.nextFloat();
                    sc.nextLine();
                    float AreaRectangle = AreaCal.area(leng,brea);
                    System.out.printf("Area of Rectangle with length %f and breadth %f is %f sq.units. \n",leng, brea,AreaRectangle);
                    break;
                case 3:
                    System.out.print("Enter the radius of ciricle : ");
                    double radius = sc.nextDouble();
                    sc.nextLine();
                    double AreaCircle = AreaCal.area(radius);
                    System.out.printf("Area of Circle with radius %f is %f sq.units. \n",radius,AreaCircle);
                    break;
                case 4:
                    System.out.println("Exiting the program!");
                    break;
                default:
                    System.out.println("Invalid Input! Please Try Again!");
            }
        }
        while(ch!=4);
        sc.close();
    }
}