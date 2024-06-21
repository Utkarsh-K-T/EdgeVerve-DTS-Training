import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class aJDBCStudentCURD {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "Mysql@369#pass");

            Statement statement = connection.createStatement();
            String createTableSQL = "CREATE TABLE IF NOT EXISTS students (" +
                                    "id INT PRIMARY KEY, " +
                                    "name VARCHAR(50), " +
                                    "age INT, " +
                                    "course VARCHAR(50))";
            statement.executeUpdate(createTableSQL);

            while (true) {
                System.out.println("Menu:");
                System.out.println("1. Create Student");
                System.out.println("2. Read Students");
                System.out.println("3. Update Student");
                System.out.println("4. Delete Student");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter ID: ");
                        int id = scanner.nextInt();
                        System.out.print("Enter Name: ");
                        String name = scanner.next();
                        System.out.print("Enter Age: ");
                        int age = scanner.nextInt();
                        System.out.print("Enter Course: ");
                        String course = scanner.next();

                        String insertSQL = "INSERT INTO students (id, name, age, course) VALUES (" + id + ", '" + name + "', " + age + ", '" + course + "')";
                        statement.executeUpdate(insertSQL);

                        System.out.println("Student created successfully.");
                        break;
                    case 2:
                        String selectSQL = "SELECT * FROM students";
                        ResultSet resultSet = statement.executeQuery(selectSQL);

                        while (resultSet.next()) {
                            int studentId = resultSet.getInt("id");
                            String studentName = resultSet.getString("name");
                            int studentAge = resultSet.getInt("age");
                            String studentCourse = resultSet.getString("course");
                            System.out.println("ID: " + studentId + ", Name: " + studentName + ", Age: " + studentAge + ", Course: " + studentCourse);
                        }
                        break;
                    case 3:
                        System.out.print("Enter ID of the student to update: ");
                        int updateId = scanner.nextInt();

                        System.out.print("Enter new Name: ");
                        String newName = scanner.next();
                        System.out.print("Enter new Age: ");
                        int newAge = scanner.nextInt();
                        System.out.print("Enter new Course: ");
                        String newCourse = scanner.next();

                        String updateSQL = "UPDATE students SET name = '" + newName + "', age = " + newAge + ", course = '" + newCourse + "' WHERE id = " + updateId;
                        statement.executeUpdate(updateSQL);

                        System.out.println("Student updated successfully.");
                        break;
                    case 4:
                        System.out.print("Enter ID of the student to delete: ");
                        int deleteId = scanner.nextInt();

                        String deleteSQL = "DELETE FROM students WHERE id = " + deleteId;
                        statement.executeUpdate(deleteSQL);

                        System.out.println("Student deleted successfully.");
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        connection.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
                scanner.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            scanner.close();
        }
        
    }
}
