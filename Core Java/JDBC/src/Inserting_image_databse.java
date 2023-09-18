//to save images we use the datatype in db is blob(Binary large object)
//maximum image storing capacity in mysql is 65 kb image only

import java.io.*;
import java.sql.*;

public class Inserting_image_databse
{
	public static void main(String[] args)
	{
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "1234");
		
		PreparedStatement pstmt = con.prepareStatement("insert into image(Picture) values(?)");
		
		//to convert the images into binary stream we save into file using serialization
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\shubh\\OneDrive\\Desktop\\Practice\\forms\\img\\download.jpg");
//		public void setBinaryStream
//		(int paramIndex,InputStream stream,long length);throws SQLException  
		  
		pstmt.setBinaryStream(1, fis,fis.available());
		pstmt.executeUpdate();
		System.out.println("DONE INSERTING IMAGES");
		
				
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
	}

}
