import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class aJDBCPreparedStatementEG {
    public static void main(String[] args) throws SQLException {
        int id, price;
        String name;
        id = 10;
        name = "God of small things";
        price = 500;

        String url = "jdbc:mysql://localhost:3306/cart";
        String user = "root";
        String pwd = "Mysql@369#pass";
        String insertSQL = "INSERT INTO books VALUES (?, ?, ?)";
        String updateSQL = "UPDATE books SET name=?, price=? WHERE id=?";
        String deleteSQL = "DELETE FROM books WHERE id=?";

        Connection con = DriverManager.getConnection(url, user, pwd);

        // Insert operation
        try (PreparedStatement insertPst = con.prepareStatement(insertSQL)) {
            insertPst.setInt(1, id);
            insertPst.setString(2, name);
            insertPst.setInt(3, price);
            int count = insertPst.executeUpdate();
            System.out.println(count + " rows added");
        }

        // Update operation
        id = 10;
        name = "WINGS OF FIRES";
        price = 700;

        try (PreparedStatement updatePst = con.prepareStatement(updateSQL)) {
            updatePst.setString(1, name);
            updatePst.setInt(2, price);
            updatePst.setInt(3, id);
            int count = updatePst.executeUpdate();
            System.out.println(count + " rows updated");
        }

        // Deletion operation
        id = 10;

        try (PreparedStatement deletePst = con.prepareStatement(deleteSQL)) {
            deletePst.setInt(1, id);
            int count = deletePst.executeUpdate();
            System.out.println(count + " rows deleted");
        }

        con.close();
    }

}
