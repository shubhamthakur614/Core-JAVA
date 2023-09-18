package com.Map.Hashtable;
import java.util.*;
import java.io.*;

public class PropertiesDemo 
{
	public static void main(String[] args) throws Exception
	{
		Properties p= new Properties();
		FileInputStream fin=new FileInputStream("abc.txt");
		p.load(fin);
		System.out.println(p);
		String s=p.getProperty("Shubham");
		System.out.println(s);
		p.setProperty("SNEHA", "143");
		FileOutputStream fos=new FileOutputStream("abc.txt");
		p.store(fos, "UPDATED VALUES");
		
		
		
	}

}
