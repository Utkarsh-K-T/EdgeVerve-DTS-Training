class Acc{
    private int accNo;
    private String accName;
    private float accBal;

    public void openAcc(String accName, int accNo, float accBal){
        this.accName = accName;
        this.accNo = accNo;
        this.accBal = accBal;
    }

    public void depo(float amt){
        accBal += amt;
        System.out.println("The account Number "+accNo+" has been deposited an amount of Rs. "+amt +". The balance is "+accBal);
    }

    public void witd(float amt){
        if(accBal<=10000){
            System.out.println("Insufficient balance");
        }
        else{
            accBal -= amt;
            System.out.println("The account Number "+accNo+" has withdrawed an amount of Rs. "+amt +". The balance is "+accBal);
        }
    }

    @Override
    public String toString(){// in this class when you pass object we want this to happen always
        return "Account Holder data -\n[Account number : "+ accNo + "\nAccount name : "+accName+"\n Account Balance : "+accBal+" ]";
    }
}



public class cBankDW {
    public static void main(String[] args) {
        Acc ac1 = new Acc();
        Acc ac2 = new Acc();
        ac1.openAcc("Utkarsh", 1, 10000);
        ac1.depo(10000);
        ac1.witd(10000);

        ac2.openAcc("Nakul", 2, 20000);
        System.out.println(ac1);
        System.out.println(ac2);
    }
}
