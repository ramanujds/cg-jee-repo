import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		
		
		String url="jdbc:mysql://localhost:3306/cg_db";
		
		String username="root";
		String password="password";
		
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Successful");
			
			Statement smt=con.createStatement();
			
//			// Fetching Data
//			
//			System.out.println("ENTER THE DEPT NAME");
//			String deptName=scan.nextLine();
//			
//			String query="select * from dept where dname='"+deptName+"'";
//			
//			ResultSet rs = smt.executeQuery(query);
//			System.out.printf("%-10s   %-10s   %-20s","Dept No.","Dept Name","Location");
//			while(rs.next()) {
//				System.out.printf("\n%-10d   %-10s   %-20s",rs.getInt("deptno"),rs.getString("dname"),rs.getString("location"));
//			}
			
			// Insert Data
			
			int deptno;
			String deptName;
			String location;
			
			System.out.println("Enter Dept Details ");
			
			deptno=scan.nextInt();
			
			deptName=scan.next()+scan.nextLine();
			
			location=scan.nextLine();
			
			//String query="insert into dept values("+deptno+",'"+deptName+"', '"+location+"')";
			
			String query = "insert into dept values(?,?,?)";
			PreparedStatement psmt=con.prepareStatement(query);
			psmt.setInt(1, deptno);
			psmt.setString(2, deptName);
			psmt.setString(3, location);
			
			int rows=psmt.executeUpdate();
			if(rows>0) {
				System.out.println("Inserted Successfully");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
