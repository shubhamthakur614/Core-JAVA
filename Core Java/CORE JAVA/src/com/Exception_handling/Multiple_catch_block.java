package com.Exception_handling;

public class Multiple_catch_block 
{
	public static void main(String[] args)
	{
		try {
		String n=null;
		System.out.println(n.length());
		
		}
		//as this is null pointer exception we are trying do another then
//		it will use parent exception class 
		catch(ArithmeticException e)
		{
			System.out.println(e);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		System.out.println("REST CODE");
		
		
	}

}
