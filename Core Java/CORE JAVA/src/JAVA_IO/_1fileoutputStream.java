package JAVA_IO;

import java.io.FileOutputStream;
import java.io.IOException;

public class _1fileoutputStream {
	public static void main(String[] args) {

		try {
			FileOutputStream fout = new FileOutputStream("D:\\f1.txt");
			byte[] b = { 'S', 'H', 'U', 'B', 'H', 'A', 'M' };
			String s="SHUBHAM THAKUR IS VERY GOOD GUY";
			byte[] b1=s.getBytes();
			fout.write(b1);
		
			fout.write(b);
			
			System.out.println("SUCCESSFULLY!!!!!!!!!!");

		     } 
		catch (IOException e) 
		{

			e.printStackTrace();
		}

	}

}
