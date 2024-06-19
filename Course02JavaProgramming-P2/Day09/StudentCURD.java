import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentCURD {
	private static final String URL = "jdbc:mysql://localhost:3306/student";
    private static final String USER = "root";
    private static final String PASSWORD = "Mysql@369#pass";

    private static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
    private static void createStudent(Connection conn, String name, String gender, String course) throws SQLException {
        String sql = "INSERT INTO students (name, gender, course) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, gender);
            pstmt.setString(3, course);
            pstmt.executeUpdate();
            System.out.println("Student added successfully.");
        }
    }
    
    private static void readStudents(Connection conn) throws SQLException {
        String sql = "SELECT * FROM students";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") + ", Name: " + rs.getString("name") + ", Gender: " + rs.getString("gender") + ", Course: " + rs.getString("course"));
            }
        }
    }
    
    
    private static void updateStudent(Connection conn, int id, String name, String gender, String course) throws SQLException {
        String sql = "UPDATE students SET name = ?, gender = ?, course = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            pstmt.setString(2, gender);
            pstmt.setString(3, course);
            pstmt.setInt(4, id);
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Student updated successfully.");
            } else {
                System.out.println("Student with ID " + id + " not found.");
            }
        }
    }
    
    private static void deleteStudent(Connection conn, int id) throws SQLException {
        String sql = "DELETE FROM students WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int rowsDeleted = pstmt.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Student deleted successfully.");
            } else {
                System.out.println("Student with ID " + id + " not found.");
            }
        }
    }
    
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Connection conn = connect();
	            Scanner scanner = new Scanner(System.in)) {
	            while (true) {
	                System.out.println("Menu:");
	                System.out.println("1. Add student");
	                System.out.println("2. View students");
	                System.out.println("3. Update student");
	                System.out.println("4. Delete student");
	                System.out.println("5. Exit");
	                System.out.print("Choose an option: ");
	                int choice = scanner.nextInt();
	                scanner.nextLine(); 

	                switch (choice) {
	                    case 1:
	                        System.out.print("Enter name: ");
	                        String name = scanner.nextLine();
	                        System.out.print("Enter gender (M/F): ");
	                        String gender = scanner.nextLine();
	                        System.out.print("Enter course: ");
	                        String course = scanner.nextLine();
	                        createStudent(conn, name, gender, course);
	                        break;
	                    case 2:
	                        readStudents(conn);
	                        break;
	                    case 3:
	                        System.out.print("Enter student ID to update: ");
	                        int idToUpdate = scanner.nextInt();
	                        scanner.nextLine();  
	                        System.out.print("Enter new name: ");
	                        String newName = scanner.nextLine();
	                        System.out.print("Enter new gender (M/F): ");
	                        String newGender = scanner.nextLine();
	                        System.out.print("Enter new course: ");
	                        String newCourse = scanner.nextLine();
	                        updateStudent(conn, idToUpdate, newName, newGender, newCourse);
	                        break;
	                    case 4:
	                        System.out.print("Enter student ID to delete: ");
	                        int idToDelete = scanner.nextInt();
	                        deleteStudent(conn, idToDelete);
	                        break;
	                    case 5:
	                        System.out.println("Exiting...");
	                        return;
	                    default:
	                        System.out.println("Invalid option. Please try again.");
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }

	}

}
