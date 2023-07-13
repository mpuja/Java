package jdbcnew;
import java.sql.*;
public class DeleteQueryEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String url = "jdbc:mysql://localhost:3306/SCHOOL";
	      String username = "root";
	      String password = "rootpassword";
	      
	    String query = "DELETE from student where std_id =1";
		     
          String query2="select * from Student";
	      
	      try {
	         Connection con = DriverManager.getConnection(url, username, password);
	         Statement st = con.createStatement();
	         int result = st.executeUpdate(query);
	         if (result > 0) {
	            System.out.println("Delete successfully");
	         } else {
	            System.out.println("No Delete  ");
	         }
	         con.close();
	      } catch (SQLException e) {
	         System.out.println("Error: " + e.getMessage());
	      }
	   }
	
	}


