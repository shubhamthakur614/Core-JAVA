package com.Exception_handling;

public class Multiple_catchblock_enhancement 
{
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(10/0);//AE
			String s=null;
			System.out.println(s.length());//NPE
			int arr[]=new int[5];
			arr[10]=20;//AIOBE
			
		}
		//this multiple catch can handle many exception at a time
		catch(ArithmeticException|NullPointerException e)
		{
			e.printStackTrace();
		}
		
		
	}

}
