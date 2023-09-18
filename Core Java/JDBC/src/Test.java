import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Test {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "1234");
			PreparedStatement pstmt = con.prepareStatement("select * from image where id=1");
			ResultSet rs = pstmt.executeQuery();
			if (rs.next()) {
				Blob b = rs.getBlob(2);
				byte[] image = b.getBytes(1, (int) b.length());
				FileOutputStream fos = new FileOutputStream("C:\\Users\\shubh\\OneDrive\\Desktop\\test1.jpg");
				fos.write(image);
				System.out.println( " Successfully Created...........");

			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
