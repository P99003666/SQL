import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Collable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/activity", "root","root");
		CallableStatement cs = c.prepareCall("{call get`Kids}");
		ResultSet rs = cs.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3) + rs.getString(4) + rs.getString(5));
		}
		c.close();
	}

}
