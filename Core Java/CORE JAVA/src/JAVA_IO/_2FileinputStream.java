package JAVA_IO;
//when you need to read only one character ffrom file
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _2FileinputStream 
{
	public static void main(String[] args) 
	{
		try {
			FileInputStream fin=new FileInputStream("D://f1.txt ");
//			reading data from file which is stored in d drive
			int i=fin.read();
			System.out.println((char)i);
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
