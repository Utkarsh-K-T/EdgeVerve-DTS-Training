import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCBMS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "Mysql@369#pass");

            Statement statement = connection.createStatement();
            String createTableSQL = "CREATE TABLE IF NOT EXISTS accounts (" +
                                    "account_number INT PRIMARY KEY, " +
                                    "balance DOUBLE)";
            statement.executeUpdate(createTableSQL);

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Menu:");
                System.out.println("1. Create Account");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Check Balance");
                System.out.println("5. Update Account");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Account Number: ");
                        int accNumber = scanner.nextInt();
                        System.out.print("Enter Initial Balance: ");
                        double initialBalance = scanner.nextDouble();

                        String insertSQL = "INSERT INTO accounts (account_number, balance) VALUES (" + accNumber + ", " + initialBalance + ")";
                        statement.executeUpdate(insertSQL);

                        System.out.println("Account created successfully.");
                        break;
                    case 2:
                        System.out.print("Enter Account Number: ");
                        int accountNumberDeposit = scanner.nextInt();
                        System.out.print("Enter Deposit Amount: ");
                        double depositAmount = scanner.nextDouble();

                        String depositSQL = "UPDATE accounts SET balance = balance + " + depositAmount + " WHERE account_number = " + accountNumberDeposit;
                        int rowsUpdated = statement.executeUpdate(depositSQL);

                        if (rowsUpdated > 0) {
                            System.out.println("Deposit successful.");
                        } else {
                            System.out.println("Failed to deposit. Account not found.");
                        }
                        break;
                    case 3:
                        System.out.print("Enter Account Number: ");
                        int accountNumberWithdraw = scanner.nextInt();
                        System.out.print("Enter Withdraw Amount: ");
                        double withdrawAmount = scanner.nextDouble();

                        String withdrawSQL = "UPDATE accounts SET balance = balance - " + withdrawAmount + " WHERE account_number = " + accountNumberWithdraw + " AND balance >= " + withdrawAmount;
                        rowsUpdated = statement.executeUpdate(withdrawSQL);

                        if (rowsUpdated > 0) {
                            System.out.println("Withdrawal successful.");
                        } else {
                            System.out.println("Failed to withdraw. Insufficient funds or account not found.");
                        }
                        break;
                    case 4:
                        System.out.print("Enter Account Number: ");
                        int accountNumberBalance = scanner.nextInt();

                        String balanceSQL = "SELECT balance FROM accounts WHERE account_number = " + accountNumberBalance;
                        ResultSet resultSet = statement.executeQuery(balanceSQL);

                        if (resultSet.next()) {
                            double balance = resultSet.getDouble("balance");
                            System.out.println("Current Balance: " + balance);
                        } else {
                            System.out.println("Account not found.");
                        }
                        break;
                    case 5:
                        System.out.print("Enter Account Number: ");
                        int accountNumberUpdate = scanner.nextInt();
                        System.out.print("Enter New Balance: ");
                        double newBalance = scanner.nextDouble();

                        String updateSQL = "UPDATE accounts SET balance = " + newBalance + " WHERE account_number = " + accountNumberUpdate;
                        rowsUpdated = statement.executeUpdate(updateSQL);

                        if (rowsUpdated > 0) {
                            System.out.println("Account updated successfully.");
                        } else {
                            System.out.println("Failed to update account. Account not found.");
                        }
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        connection.close();
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}


