import java.io.*;
import java.sql.*;

public class Insert_data_into_table {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "1234");
			Statement stmt = con.createStatement();
			int status = stmt.executeUpdate("insert into student values(3,'rajesh','rote')");
			System.out.println(status + " inserted Sucessfully");

		   } catch (Exception e) {
			System.out.println(e);
		}

	}
}
