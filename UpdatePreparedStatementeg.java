package jdbcnew;
import java.sql.*;

public class UpdatePreparedStatementeg {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/SCHOOL";
        String username = "root";
        String password = "rootpassword";
        String query = "UPDATE STUDENTS SET std_Name=? WHERE Std_ID=?";
        String query2 = "SELECT * FROM Students";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement st = con.prepareStatement(query);

            st.setString(1, "Gita");
            st.setInt(2, 1);

            int result = st.executeUpdate();
            if (result > 0) {
                System.out.println("Update prepared Statement successful");
            } else {
                System.out.println("No records were updated.");
            }

            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}




