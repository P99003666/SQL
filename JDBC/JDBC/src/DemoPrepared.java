import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DemoPrepared {
	public static void main(String[] args) throws Exception {
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root");
		PreparedStatement p = c.prepareStatement("select * from persons");
		ResultSet rs = p.executeQuery();
		System.out.println("prepared Statemtn");
		while(rs.next())
		{
			System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3) + rs.getString(4) + rs.getString(5));
		}
	}
}
