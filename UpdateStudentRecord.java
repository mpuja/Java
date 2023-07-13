package jdbcnew;
import java.sql.*;
public class UpdateStudentRecord {
	
	   public static void main(String[] args) {
	      String url = "jdbc:mysql://localhost:3306/SCHOOL";
	      String username = "root";
	      String password = "rootpassword";
	      String query = "UPDATE STUDENTS SET std_Name='Asha22' WHERE std_ID=2";
	    // String query = "INSERT INTO STUDENT(std_Name,std_ID) VALUES ('sita',5)";
		     
          String query2="select * from Students";
	      
	      try {
	         Connection con = DriverManager.getConnection(url, username, password);
	         Statement st = con.createStatement();
	         int result = st.executeUpdate(query);
	         if (result > 0) {
	            System.out.println("update successfully");
	         } else {
	            System.out.println("No update  ");
	         }
	         con.close();
	      } catch (SQLException e) {
	         System.out.println("Error: " + e.getMessage());
	      }
	   }
	}


