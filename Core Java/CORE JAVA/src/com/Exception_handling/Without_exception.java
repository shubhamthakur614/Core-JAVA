package com.Exception_handling;

public class Without_exception 
{
	public static void main(String[] args) 
	{
		try {
			
		
		int a=10,b=0,c;
		c=a/b;
		System.out.println(c);
		
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Rest of the code");
		
	}

}
