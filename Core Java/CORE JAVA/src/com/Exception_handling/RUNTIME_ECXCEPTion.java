package com.Exception_handling;

public class RUNTIME_ECXCEPTion 
{
	public static void main(String[] args) 
	{
		try
		{int a=10;
		int b=0;
		int c;
		c=a/b;
		System.out.println(c);
//		String s=null;
		}
		catch(Exception e)
		{
			System.out.println(e);
			// if you want the stack trace then you have to use
			e.printStackTrace();
			System.out.println(e.getMessage( ));
		}
		
	}

}
