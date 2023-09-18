//if you want additional information from table then you 
//should use metadata

import java.sql.*;

public class ResultSet_meta_data 
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","1234");
		PreparedStatement stmt=con.prepareStatement("select * from student");
		ResultSet rs=stmt.executeQuery();
		ResultSetMetaData rsmd=rs.getMetaData();
		//it has four method to get addition information about table
		
		System.out.println(rsmd.getColumnCount());
		System.out.println(rsmd.getColumnName(2));
		System.out.println(rsmd.getColumnTypeName(1));
		System.out.println(rsmd.getTableName(3));
		
		
	}

}
