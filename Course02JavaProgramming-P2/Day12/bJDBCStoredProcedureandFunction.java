import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import com.mysql.cj.jdbc.CallableStatement;

public class bJDBCStoredProcedureandFunction 
{
	public static void main(String[] args) throws SQLException 
	{
        int id, price;
        String name;
        id = 1;
        name = "God of small things";
        price = 500;

        String url = "jdbc:mysql://localhost:3306/cart";
        String user = "root";
        String pwd = "Mysql@369#pass";
        
        Connection con = DriverManager.getConnection (url, user, pwd) ;
        //String sql = "{?=call findPriceByID(?)}";
        
        CallableStatement cst = (CallableStatement) con.prepareCall("{?=call findPriceByID(?)}");
  
        cst.registerOutParameter(1, Types.INTEGER);
        cst.setInt(2, id);
        cst.execute();
        price = cst.getInt(1);
        System.out.println("Price of book with ID " + id + " is " + price);
        
        cst = (CallableStatement) con.prepareCall("{call findBookNameById(?,?)}");
        cst.setInt(1,id);
        cst.registerOutParameter(2, Types.INTEGER);
        cst.execute();
        System.out.println("Book name with ID " + id + " is " + cst.getString(2));
        
        
	}
}
