package com.Exception_handling;

public class Finally 
{
	public static void main(String[] args) 
	{
		try 
		{
		int a=5/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("FINALLY BLOCK ALWAYS EXECUTED WHETHER Exception CODE HANDLE OR NOT");
		}
		//only becz of System.exit(); finally not executes and fetal error
		
	}

}
