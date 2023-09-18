import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC 
{
	public static void main(String[] args) 
	{
		try
		{
			//Class.forName("com.mysql.jdbc.Driver")//this is deprecated
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham","root","1234");
			Statement stmt=con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from book");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getFloat(4));
			}
			
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
