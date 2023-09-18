import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Batch_using_statement {
	public static void main(String[] args) {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "1234");
			Statement stmt = con.createStatement();

			stmt.addBatch("insert into book values(null,'MRUTUNJAY','SHIVAJI SAWANT',500)");
			stmt.addBatch("insert into book values(null,'LETs C','YASHWANT KANETKAR',700)");
			stmt.addBatch("insert into book values(null,'JAVA','JEMES JOSLING',1200)");
			stmt.addBatch("insert into book values(null,'HTML','DON WATSON',250)");

			int count[] = stmt.executeBatch();
			System.out.println("RECORDS SUCCESSFULLY INSERTED");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
