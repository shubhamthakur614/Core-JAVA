package com.Exception_handling;

public class Exception_printing_methods 
{
	public static void main(String[] args) 
	{
		
		
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println(e);//or
			System.out.println(e.toString());//when ever we trying to call object reference toString method by default is called
			System.out.println(e.getMessage());
			
		}
		
	}

}
