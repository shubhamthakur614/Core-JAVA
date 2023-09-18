import java.sql.*;

public class FETCH_DATA_prepared 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","1234");
		PreparedStatement stmt=con.prepareStatement("select * from student");
		ResultSet rs=stmt.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t");
		}
		
		
		
		
	}

}
