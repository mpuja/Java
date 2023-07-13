package jdbcnew;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQueryeg {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/SCHOOL";
        String username = "root";
        String password = "rootpassword";
        String query = "INSERT INTO STUDENT (std_Name, std_ID)VALUES('Sita',1)";
        String query2="select * from Student";
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
            int result = st.executeUpdate(query);
            if (result > 0) {
                System.out.println("Insertion successfully");
            } else {
                System.out.println("No Insertion");
            }
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
