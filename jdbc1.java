package jdbcDemo1;
import java.sql.*;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		public class Demo1 {

				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Password123");
					Statement stmt=con.createStatement();
					stmt.execute("insert into emp values(101,'Ram','33',9888,'Manager')");
					stmt.close();
					System.out.println("Data saved successfully");
				}
				catch (Exception e) {
					System.out.println(e);
				}
			}
		

	}