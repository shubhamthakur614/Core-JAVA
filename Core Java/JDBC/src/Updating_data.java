import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Updating_data {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "1234");
			Statement stmt = con.createStatement();
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ENTER THE  NAME AND LastName");
			String n = br.readLine();
			String ln = br.readLine();
			int i = stmt.executeUpdate("Update student set Name='" + n + "' where surname='" + ln + "'");

			if (i > 0) {
				System.out.println("UPDATED SUCCESSFULLY!!!!!!!!!!!!");
			} else {
				System.out.println("SOMETHING WRONG!!!!!!!!!!");
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
