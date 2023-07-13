package jdbcnew;
import java.sql.*;
public class DisplayStudentRecord {
	    public static void main(String[] args)throws Exception {
	        String url = "jdbc:mysql://localhost:3306/college";
	        String username = "root"; 
	        String password = "rootpassword";
	        String query = "select RollNo, name,Level, Division ,major FROM students WHERE Division='Distinction'AND major='Data SCIENCE'";
	           
	        Connection con = DriverManager.getConnection(url, username, password);
	            Statement st = con.createStatement();
	           
	            ResultSet rs = st.executeQuery(query);
	            while(rs.next()) {
	                int rollNo = rs.getInt("RollNo");
	                String name = rs.getString("name");
	                String level = rs.getString("Level");
	                String division = rs.getString("Division");
	                String major = rs.getString("Major");
	                
	                System.out.println("Roll No: " + rollNo);
	                System.out.println("Name: " + name);
	                System.out.println("Level: " + level);
	                System.out.println("Division: " + division);
	                System.out.println("Major: " + major);
	            }

	            rs.close();
	            st.close();
	            con.close();
	       
	        }
	    }
	


