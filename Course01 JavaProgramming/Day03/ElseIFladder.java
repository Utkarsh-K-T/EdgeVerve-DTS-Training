import java.util.Scanner;
public class ElseIFladder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter marks : ");
        int m = scanner.nextInt();

        if(m>90){
            System.out.println("A+");
        }
        else if(m>80 && m<=90){
            System.out.println("A");
        }
        else if(m>70 && m<=80){
            System.out.println("B");
        }
        else if(m>60 && m<=70){
            System.out.println("C");
        }
        else{
            System.out.println("Failed");
        }

        String grade;
        if(m>90){
            grade = "A+";
        }
        else if(m>80 && m<=90){
            grade = "A";
        }
        else if(m>70 && m<=80){
            grade = "B";;
        }
        else if(m>60 && m<=70){
            grade = "C";;
        }
        else{
            grade = "Failed";;
        }
        System.out.println(grade);

        String g;
        if(m>90){
            g = "A+";
        }
        else if(m>=80){
            g = "A";
        }
        else if(m>=70){
            g = "B";;
        }
        else if(m>=60){
            g = "C";;
        }
        else{
            g = "Failed";;
        }
        System.out.println(g);
        
        scanner.close();
    }
}
