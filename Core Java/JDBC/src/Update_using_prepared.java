import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update_using_prepared 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","1234");
			PreparedStatement ps=con.prepareStatement("update student set Name=? where Surname=? ");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("ENTER THE  NAME AND Lastname ");
			String n=br.readLine();
			String ln=br.readLine();
			ps.setString(1, n);
			ps.setString(2,ln);
			
			int i=ps.executeUpdate();
			if(i>0)
			{
				System.out.println("INSERTED!!!!!!!!");
			}
			else
			{
				System.out.println("TRY AGAIN!!!1");
			}
			
			
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
		
	}

}
