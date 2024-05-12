class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            System.out.print("\nDeposit successful of "+amount+" Prev Balance: Rs."+balance);
            balance += amount;
            System.out.print(". New balance: Rs." + balance +"\n");
        } else {
            System.out.println("\nDeposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            System.out.print("\nWithdrawal successful of Rs."+amount+" Prev balance: Rs." + balance);
            balance -= amount;
            System.out.print("New balance: Rs." + balance+"\n");
        } else if (amount <= 0) {
            System.out.println("\nWithdrawal amount must be positive.");
        } else {
            System.out.println("\nInsufficient funds. Withdrawal failed.");
        }
    }
}

class SavingsAccount extends BankAccount {
    private final double minimumBalance = 1000;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
        if (initialBalance < minimumBalance) {
            System.out.println("\nSavings account requires a minimum balance of Rs." + minimumBalance);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && balance - amount >= minimumBalance) {
            super.withdraw(amount); 
        } else {
            System.out.println("\nWithdrawal failed. Minimum balance of Rs." + minimumBalance + " must be maintained.");
        }
    }
}

public class cBankSystemOverride {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(2000);
        SavingsAccount account2 = new SavingsAccount(2000);

        account1.deposit(1000);
        account1.withdraw(500);

        account2.deposit(1000);
        account2.withdraw(2100);
        account2.withdraw(2000);
    }
}
