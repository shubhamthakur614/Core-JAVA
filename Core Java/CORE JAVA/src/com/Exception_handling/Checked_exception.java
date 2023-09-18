package com.Exception_handling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Checked_exception 
{
	public static void main(String args[]) throws FileNotFoundException,ClassNotFoundException
	{
		
			Class.forName("com.mysql.cj.jdbc.Driver");
			File file=new File("c://abc.txt");
			FileReader fr=new FileReader("abc");
		
	}

}
