import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DemoMain {
	public static void main(String[] args) throws Exception {
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "root"); /// check the
																										/// connection
		System.out.println("Connection Created");
		Statement s = c.createStatement();
//		s.execute("insert into persons values(2,'Kundu', 'Somya', 'LTTS', 'Mysore')");
		ResultSet rs = s.executeQuery("select * from persons");

		while (rs.next()) {
			System.out.println(rs.getInt(1) + rs.getString(2) + rs.getString(3) + rs.getString(4) + rs.getString(5));
		}
		s.executeUpdate("update persons set firstname = 'somyajeet' where personid=1 ");
		ResultSet rs1 = s.executeQuery("select * from persons ");
		while (rs1.next()) {
			System.out.println(rs1.getInt(1) + rs1.getString(2) + rs1.getString(3) + rs1.getString(4) + rs1.getString(5));
		}
		s.close();
	}

}
