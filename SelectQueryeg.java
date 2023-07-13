package jdbcnew;
import java.sql.*;
public class SelectQueryeg {

	    public static void main(String[] args) throws Exception {
	        String url = "jdbc:mysql://localhost:3306/SCHOOL";
	        String uname = "root";
	        String pass = "rootpassword";
	        String query = "SELECT Std_name FROM STUDENT WHERE Std_id=2";

	        Class.forName("com.mysql.cj.jdbc.Driver");
	        try (Connection con = DriverManager.getConnection(url, uname, pass);
	             Statement st = con.createStatement();
	             ResultSet rs = st.executeQuery(query)) {
	            if (rs.next()) {
	                String name = rs.getString("Std_name");
	                System.out.println(name);
	            } else {
	                System.out.println("No records found.");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}


