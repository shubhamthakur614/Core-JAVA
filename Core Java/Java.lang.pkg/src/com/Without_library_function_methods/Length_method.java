package com.Without_library_function_methods;


//To calculate the length of the string convert the string to a character array and count the number of elements in the array.

public class Length_method 
{
	public static void main(String[] args) 
	{
		String s="SHUBHAM Anant THAKUR";
		int count=0;
		for(char c:s.toCharArray())
		{
			count++;
		}
		System.out.println("LENGTH OF STRING:" +count);
	}

}
