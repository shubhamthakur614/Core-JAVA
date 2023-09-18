import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

class MyBlood extends RuntimeException 
{
	public MyBlood(String s) {
		super(s);
	}
}

public class BloodExample {
	public static void main(String[] args) {

		try {
			System.out.println("Welcome to Shubham Hospital!!!!!!!!!");

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "1234");
			System.out.println("ENTER THE BLOOD GROUP THAT YOU WANT");
			Scanner sc = new Scanner(System.in);
			String s = sc.next();
			PreparedStatement ps = con.prepareStatement("select * from Blood where BloodGroup= ? ");
			ps.setString(1, s);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {

				System.out.println("BLOOD IS AVALIBLE:" + rs.getString("Avaliable"));

			}

		}
		catch (Exception e) 
		{
			System.out.println(e);

		}

	}
}
