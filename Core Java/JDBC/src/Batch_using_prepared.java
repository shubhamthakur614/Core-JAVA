import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Batch_using_prepared {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/shubham", "root", "1234");
			PreparedStatement ps = con.prepareStatement("insert into book values(?,?,?,?)");
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			while(true)
			{
				System.out.println("ENTER BOOK NAME AUTHOR NAME AND PRICE:");
				String bn=br.readLine();
				String an=br.readLine();
				float p=Float.parseFloat(br.readLine());
				
				ps.setNString(1, null);
				ps.setString(2,bn);
				ps.setString(3, an);
				ps.setFloat(4, p);
				
				
				
				ps.addBatch();
				
				System.out.println("DO YOU WANT TO ADD AGAIN ANY MORE y/n");
				String choice=br.readLine();
				if(choice.equals("n"));
				{
					break;
				}
			}
			   
			ps.executeBatch();
			System.out.println("RECORD SUCCESSFULLY INSERTED:");
			con.close();
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
