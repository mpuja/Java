package jdbcnew;
import java.sql.*;
public class Databasedemo {
 public static void main(String[]args) throws Exception{
	 String url="jdbc:mysql://Localhost:3306/SCHOOL";
	 String uname="root";
	 String pass="rootpassword";
	 String query="SELECT Std_name From STUDENTS where Std_id=1";
	 
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 Connection con = DriverManager.getConnection(url,uname,pass);
	 Statement st = con.createStatement();
	 ResultSet rs=st.executeQuery(query);
	 rs.next();
	 String name=rs.getString("Std_name");
	 System.out.println(name);
	 
	 st.close();
	 con.close();
 }
}
