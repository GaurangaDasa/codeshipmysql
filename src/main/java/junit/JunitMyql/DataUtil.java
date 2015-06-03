package junit.JunitMyql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataUtil {

	
	public void viewSomeData() {
		
		String host="localhost";
		String port="3306";
		String un=System.getenv("MYSQL_USER");
	//	String un="root";
		String pw=System.getenv("MYSQL_PASSWORD");
	//	String pw="root";
		String database="test";
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/"+database,un,pw);
			PreparedStatement pst = con.prepareStatement("show tables;");
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
