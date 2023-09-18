package JAVA_IO;

import java.io.*;


public class _3FileinputStream {
	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("D:\\f1.txt");
			int i=0;
			while((i=fin.read())!=-1)
			{
				System.out.print((char)i);
				
			}
			fin.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
