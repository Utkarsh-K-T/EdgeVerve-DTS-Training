//Java Program to demonstrate the working of a banking-system, where we deposit and withdraw amount from our account, Creating an Account class which has deposit() and withdraw() methods 
import java.util.Scanner;

class Acc{
    private int accNo;
    private String accName;
    private double accBal;

    public void depo(double amt){
        accBal += amt;
        System.out.println("The account Number "+accNo+" has been deposited an amount of Rs. "+amt +". The net balance is "+accBal);
    }

    public void witd(double amt){
        if(accBal<=1000 || (amt+1000>accBal)){
            System.out.println("Insufficient balance");
        }
        else{
            accBal -= amt;
            System.out.println("The account Number "+accNo+" has withdrawed an amount of Rs. "+amt +". The balance is "+accBal);
        }
    }

    public void checkBalance() {
        System.out.println("Your balance is: " + accBal);
    }

    public void openAcc(String accName, int accNo, double accBal){
        this.accName = accName;
        this.accNo = accNo;
        this.accBal = accBal;
    }

    @Override
    public String toString(){// in this class when you pass object we want this to happen always
        return "Account Holder data : [Account name : "+accName+"] [Account number : "+ accNo + "] [Account Balance : "+accBal+"] ";
    }
}

public class jBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Acc account = new Acc();
        int ch = 1;

        String name="";
        int anum=1;
        double amts=1000; 

        do{
            System.out.print("\nBanking System Menu\n1.Create Account\n2.Deposit\n3.Withdraw\n4.Check-Balance\n5.Exit\nEnter your choice :");
            ch = sc.nextInt();
	        sc.nextLine();

            switch(ch){
                case 1:
                    System.out.println("New Account Menu");
                    System.out.print("Enter you name : ");
                    name = sc.nextLine();
                    System.out.print("Enter you account number : ");
                    anum = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Deposit balance >=1000: ");
                    amts = sc.nextDouble();
                    sc.nextLine();
                    account.openAcc(name,anum,amts);
                    System.out.print(account);
                    break;

                case 2:
                    System.out.println("Deposit Menu");
                    System.out.print("Enter you account number : ");
                    anum = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Deposit amt : ");
                    amts = sc.nextDouble();
                    sc.nextLine();
                    account.depo(amts);
                    System.out.print(account);
                    break;

                case 3:
                    System.out.println("Withdraw Menu");
                    System.out.print("Enter you account number : ");
                    anum = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Withdrawal amt : ");
                    amts = sc.nextDouble();
                    sc.nextLine();
                    account.witd(amts);
                    System.out.print(account);
                    break;

                case 4:
                    System.out.println("Check-Balance Menu");
                    System.out.print("Enter you account number : ");
                    anum = sc.nextInt();
                    sc.nextLine();
                    account.checkBalance();
                    System.out.print(account);
                    break;

                case 5:
                    System.out.print(account);
                    System.out.println("Exiting the Banking System");
                    break;

                default:
                    System.out.println("Invalid Input! Please Try Again!");
            }
        }
        while(ch!=5);
        sc.close();
    }
}
