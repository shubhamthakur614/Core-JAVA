import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert_using_preparedstmt 
{
	public static void main(String[] args) 
	{
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "1234");
			PreparedStatement pstmt = con.prepareStatement("insert into student values(?,?,?)");
			do {
				System.out.println("Enter your Name And Lastname");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				String n = br.readLine();
				String ln = br.readLine();
				pstmt.setInt(1, 0);
				pstmt.setString(2, n);
				pstmt.setString(3, ln);
				int status = pstmt.executeUpdate();
				if(status>0)
				{
				System.out.println(status+" Inserted Sucessfully ");
				}
				else
				{
					System.out.println("Something went Wrong PLz try Again!!!!!!");
				}
				
				System.out.println("Do you want to continue Y/N");
				String check = br.readLine();
				String checked = check.toUpperCase();
				if (checked.startsWith("N")) 
				{
					System.out.println("Thank For Visiting Our Website!!!!!!");
					break;
				}

			} while (true);

		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

}
