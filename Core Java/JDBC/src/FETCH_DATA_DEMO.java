import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FETCH_DATA_DEMO 
{
	public static void main(String[] args) 
	{
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham","root","1234");//javatpoint
			Statement stmt=con.createStatement();
			ResultSet  rs=stmt.executeQuery("select* from Book");//student
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getFloat(4));
				//System.out.println(+rs.getInt(1)+" "+rs.getString(2)+" "+rs.getNString(3)+" "+rs.getDate(4)+" "+rs.getInt(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8)+" "+rs.getFloat(9)+" ");
			}
			con.close();
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
