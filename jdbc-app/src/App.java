import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

	public static void main(String[] args) {
		
		String url="jdbc:mysql://localhost:3306/cg_db";
		
		String username="root";
		String password="password";
		
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Successful");
			
			Statement smt=con.createStatement();
			
			String query="select * from dept";
			
			ResultSet rs = smt.executeQuery(query);
			System.out.printf("%-10s   %-10s   %-20s","Dept No.","Dept Name","Location");
			while(rs.next()) {
				System.out.printf("\n%-10d   %-10s   %-20s",rs.getInt("deptno"),rs.getString("dname"),rs.getString("location"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
