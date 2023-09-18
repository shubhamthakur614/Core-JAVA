package com.Exception_handling;

public class TRY_CATCH_BLOCK 
{
	public static void main(String[] args) {
		
	
	try
	{
		
		int data=50/0; //may throw exception  
		 
		
	}
	//handle the exception;
	catch(Exception  e)
	{
		System.out.println(e);
	}
	
	System.out.println("REST OF THE CODE");
	
	}
}
