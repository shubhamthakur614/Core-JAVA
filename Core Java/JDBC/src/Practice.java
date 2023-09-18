import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Practice 
{
	public static void main(String[] args) 
	{
		try
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","1234");
			Statement stmt=con.createStatement();
			stmt.addBatch("insert into book values(null,'Ikigai','Audiable',400)");
			stmt.addBatch("insert into book values(null,'Lored Of Ring','HOLLYWOOD',5000)");
			
			int count[]=stmt.executeBatch();
			System.out.println("RECORDS SUCCESSFULLY INSERTED");
		
			
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
