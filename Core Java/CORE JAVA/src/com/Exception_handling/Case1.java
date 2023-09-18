package com.Exception_handling;

import java.io.IOException;
import java.io.PrintWriter;

public class Case1 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println("HII");
		PrintWriter pw=new PrintWriter("abc.txt");
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
			
		}
		finally//optional
		{
			
		}
		//if you are using compile time exception at the catch when there is no 
//		exception in program then you get error
		
		
	}

}
