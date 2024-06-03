import java.util.Scanner;

public class CalWithSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Arithmetic Calculator ");

        System.out.print("Select operation?\n 1) +\n2) -\n3 *\n4) /\n5)%\n Enter the choic : ");
        char cho = sc.next().charAt(0);

        System.out.print("Value of operand1 = ");
        double opr1 = sc.nextInt();
        
        System.out.print("Value of operand2 = ");
        double opr2 = sc.nextInt();

        switch(cho){
            case '1':
                double sum = opr1 + opr2;
                System.out.println("opr1 + opr2 = "+sum);
                break;
                
            case '2':
                double sub = opr1 - opr2 ;
                System.out.println("opr1 - opr2 = "+sub);
                break;

            case '3':
                double mult = opr1 * opr2;
                System.out.println("opr1 * opr2 = "+mult);
                break;

            case '4':
                double div = opr1 / opr2;
                System.out.printf("opr1 / opr2 = "+div);
                break;

            case '5':
                double modu = opr1 % opr2;
                System.out.println("opr1 % opr2 = "+modu);
                break;

            default:
                System.out.println("Wrong Input!");
        }

        sc.close();

    }
}
