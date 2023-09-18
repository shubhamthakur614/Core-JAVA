import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Delete_DATA 
{
	public static void main(String[] args)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham", "root", "1234");
			Statement stmt = con.createStatement();
			int i=stmt.executeUpdate("delete from book where Id=5 ");
			if(i>0)
			{
				System.out.println("RECORD Deleted SUCCESSFULLY:");
			}
			else
			{
				System.out.println("TRY AGAIN !!!!!!!!!");
			}
		
	}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
			
		}

}
