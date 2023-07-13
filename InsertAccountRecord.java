package jdbcnew;
import java.sql.*;
public class InsertAccountRecord {
	   public static void main(String[] args) {
	      String url = "jdbc:mysql://localhost:3306/customer_records";
	      String username = "root";
	      String password = "rootpassword";
	      String query = "INSERT INTO customer_records(acc_id, acc_type) VALUES ('2','fixed')";
	     
           String query2="select * from customer_records";
	      
           try {
	    	  
	         Connection con = DriverManager.getConnection(url, username, password);
	         PreparedStatement st = con.prepareStatement(query);
	      
	         int result = st.executeUpdate();
	         if (result > 0) {
	            System.out.println("Sucessfully inserted");
	         }
	         con.close();
	      } catch (SQLException e) {
	         System.out.println("Error: " + e.getMessage());
	      }
	   }
	}


