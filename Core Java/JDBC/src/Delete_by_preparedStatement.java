import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete_by_preparedStatement {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "1234");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ENTER THE  NAME ");
			String n = br.readLine();

			PreparedStatement ps = con.prepareStatement("delete from student where Name=?");
			ps.setString(1, n);

			int i = ps.executeUpdate();
			if (i > 0) {
				System.out.println("SUCCESSFULLY Deleted");
			} else {
				System.out.println("TRY AGAIN");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
